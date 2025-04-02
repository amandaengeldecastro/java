package com.compass.brasil.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.compass.brasil.controller.form.EstadoForm;
import com.compass.brasil.dto.DetalhesEstadoDto;
import com.compass.brasil.dto.EstadoDto;
import com.compass.brasil.modelo.Estado;
import com.compass.brasil.repository.EstadoRepository;


@RestController
@RequestMapping(value = "/compass")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@RequestMapping(
			  value = "/regiao", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	public List<EstadoDto> listaRegiao(String regiao){
		if(regiao == null) {
			List<Estado>estados = estadoRepository.findAll();
			return EstadoDto.converter(estados);
		} else {
			List<Estado>estados = estadoRepository.findByRegiao(regiao);
			return EstadoDto.converter(estados);
		}
	}
				
	@RequestMapping(
			  value = "/populacao", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	public Page<EstadoDto> listaPopulacao(){
		Pageable paginacao = PageRequest.of(0, 26, Sort.by(Direction.DESC, "populacao"));
		Page<Estado> estado = estadoRepository.findAll(paginacao);
		return EstadoDto.converter(estado);
	}
	
	@GetMapping("/area")
	public Page<EstadoDto> listaArea(){
		Pageable paginacao = PageRequest.of(0, 26, Sort.by(Direction.DESC, "area"));
		Page<Estado> estado = estadoRepository.findAll(paginacao);
		return EstadoDto.converter(estado);
	}
		
	@PostMapping
	@Transactional 
	//Assinatura do método - o que estou prometendo fazer 
	//MODIFICADOR DE ACESSO (PUBLIC) - TIPO DE RETORNO (ResponseEntity) - NOME DO MÉTODO(CADASTRAR) - ARGUMENTOS(EstadoForm) 
	public ResponseEntity<EstadoDto> cadastrarEstado(@RequestBody @Valid EstadoForm estadoForm, UriComponentsBuilder uriBuilder){
		Estado estado = estadoForm.converter(estadoForm);
		estadoRepository.save(estado);
		
		URI uri = uriBuilder.path("/estados/{id}").buildAndExpand(estado.getId()).toUri();
		return ResponseEntity.created(uri).body(new EstadoDto(estado));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Estado> detalhar(@PathVariable Long id) {
		Optional<Estado> estado = estadoRepository.findById(id);
		if (estado.isPresent()) {
			return ResponseEntity.ok(estado.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EstadoDto> atualizar(@PathVariable Long id, @RequestBody @Valid EstadoForm form) {
		Optional<Estado> estadoOptional = estadoRepository.findById(id);
		if (estadoOptional.isPresent()) {
			Estado estado = form.atualizar(id, form);
			estadoRepository.save(estado);
			return ResponseEntity.ok(new EstadoDto(estado));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Estado> optional = estadoRepository.findById(id);
		if (optional.isPresent()) {
			estadoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}	