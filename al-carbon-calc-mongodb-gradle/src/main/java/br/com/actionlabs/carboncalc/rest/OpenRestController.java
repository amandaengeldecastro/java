package br.com.actionlabs.carboncalc.rest;

import br.com.actionlabs.carboncalc.dto.*;
import br.com.actionlabs.carboncalc.enums.TransportationType;
import br.com.actionlabs.carboncalc.model.EnergyEmissionFactor;
import br.com.actionlabs.carboncalc.model.SolidWasteEmissionFactor;
import br.com.actionlabs.carboncalc.model.TransportationEmissionFactor;
import br.com.actionlabs.carboncalc.repository.EnergyEmissionFactorRepository;
import br.com.actionlabs.carboncalc.repository.SolidWasteEmissionFactorRepository;
import br.com.actionlabs.carboncalc.repository.TransportationEmissionFactorRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/open")
@RequiredArgsConstructor
@Slf4j
public class OpenRestController {

  @Autowired
  private EnergyEmissionFactorRepository energyEmissionFactorRepository;

  @Autowired
  private SolidWasteEmissionFactorRepository solidWasteEmissionFactorRepository;

  @Autowired
  private TransportationEmissionFactorRepository transportationEmissionFactorRepository;

    /**I didn't understand how to calculate using this basics info. Should I have created a new collection? 
     * The id should be considered as the UF? 
     * The collection energyEmissionFactor, solidWasteEmissionFactor and transportationEmissionFactor 
     * have different data from those received in the request (_id, recyclableFactor, nonRecyclableFactor, factor) **/
   @PostMapping("start-calc")
    public ResponseEntity<?> startCalculation(@RequestBody StartCalcRequestDTO request) {
    List<String> errors = new ArrayList<>();

    if (request.getName() == null || request.getName().isEmpty()) errors.add("name");
    if (request.getEmail() == null || request.getEmail().isEmpty()) errors.add("email");
    if (request.getUf() == null || request.getUf().isEmpty()) errors.add("uf");
    if (request.getPhoneNumber() == null || request.getPhoneNumber().isEmpty())errors.add("phone number");

    if (!errors.isEmpty()) return new ResponseEntity<>(buildErrorResponse(errors), HttpStatus.BAD_REQUEST);

    StartCalcResponseDTO responseDTO = new StartCalcResponseDTO();
    responseDTO.setId(request.getUf());
    return ResponseEntity.ok(responseDTO);
  }

  private Map<String, String> buildErrorResponse(List<String> errors) {
    Map<String, String> errorResponse = new HashMap<>();
    String errorMessage = formatErrorMessage(errors);
    errorResponse.put("error", errorMessage);
    return errorResponse;
  }

  private String formatErrorMessage(List<String> errors) {
    if (errors.size() == 1) {
      return capitalize(errors.get(0)) + " is required";
    } else {
      String lastError = errors.get(errors.size() - 1);
      List<String> allExceptLast = errors.subList(0, errors.size() - 1);
      return String.join(", ", allExceptLast) + " and " + capitalize(lastError) + " are required";
    }
  }

  private String capitalize(String str) {
    if (str == null || str.isEmpty())
      return str;
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

  /** Should i have to create a new collection?**/
  @PutMapping("/info")
  public ResponseEntity<Object> updateInfo(@RequestBody UpdateCalcInfoRequestDTO request) {
    UpdateCalcInfoResponseDTO responseDTO = new UpdateCalcInfoResponseDTO();
    
    if (request.getRecyclePercentage() < 0 || request.getRecyclePercentage() > 1) {
      return ResponseEntity.badRequest().body(Map.of("error", "Recycle Percentage inválido."));
      }
      
      EnergyEmissionFactor energyEmissionFactor = energyEmissionFactorRepository.findById(request.getId())
      .orElseGet(() -> {
        EnergyEmissionFactor newFactor = new EnergyEmissionFactor();
        newFactor.setUf(request.getId());
        /** How to calculate the new value of factor? **/
            newFactor.setFactor(0.0);
            return energyEmissionFactorRepository.save(newFactor);
        });

    double energyEmission = request.getEnergyConsumption() * energyEmissionFactor.getFactor();

    double transportationEmission = 0;
    for (TransportationDTO transportation : request.getTransportation()) {
        try {
            TransportationEmissionFactor transportationEmissionFactor = transportationEmissionFactorRepository
                .findById(TransportationType.valueOf(transportation.getType().name()))
                .orElse(null);

            if (transportationEmissionFactor == null) {
                return ResponseEntity.badRequest().body(Map.of("error", "Type " + transportation.getType() + " inválido."));
            }

            transportationEmission += transportation.getMonthlyDistance() * transportationEmissionFactor.getFactor();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", "Type " + transportation.getType() + " inválido."));
        }
    }

    SolidWasteEmissionFactor solidWasteEmissionFactor = solidWasteEmissionFactorRepository.findById(request.getId())
        .orElse(null);
    if (solidWasteEmissionFactor == null) {
        return ResponseEntity.badRequest().body(Map.of("error", "Emission factor for solid waste not found."));
    }

    double solidWasteEmission = request.getSolidWasteTotal() * solidWasteEmissionFactor.getRecyclableFactor()
        * request.getRecyclePercentage()
        + request.getSolidWasteTotal() * solidWasteEmissionFactor.getNonRecyclableFactor()
            * (1 - request.getRecyclePercentage());

    double totalEmission = energyEmission + transportationEmission + solidWasteEmission;

    responseDTO.setSuccess(true);

    return ResponseEntity.ok(responseDTO);
}

  /** Wich data i have to return in transportation field? The collection transportationEmissionFactor returns only id (vehicle) and factor.
   * I receive in path param an id, that I'm considering as UF**/
 @GetMapping("/result/{id}")
public ResponseEntity<CarbonCalculationResultDTO> getResult(@PathVariable String id) {
    Optional<EnergyEmissionFactor> energyFactorOpt = energyEmissionFactorRepository.findById(id);
    Optional<SolidWasteEmissionFactor> solidWasteFactorOpt = solidWasteEmissionFactorRepository.findById(id);

    if (energyFactorOpt.isEmpty() || solidWasteFactorOpt.isEmpty()) {
        return ResponseEntity.badRequest().body(null);
    }

    double energyEmission = energyFactorOpt.get().getFactor();
    double solidWasteEmission = solidWasteFactorOpt.get().getRecyclableFactor();
    double transportationEmission = energyFactorOpt.get().getFactor();

    double totalEmission = energyEmission + transportationEmission + solidWasteEmission;

    CarbonCalculationResultDTO resultDTO = new CarbonCalculationResultDTO();
    resultDTO.setEnergy(energyEmission);
    resultDTO.setTransportation(transportationEmission);
    resultDTO.setSolidWaste(solidWasteEmission);
    resultDTO.setTotal(totalEmission);

    return ResponseEntity.ok(resultDTO);
}

}
