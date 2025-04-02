package com.compass.partidos.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.compass.partidos.controller.dto.AssociadoDto;
import com.compass.partidos.controller.form.AssociadoForm;
import com.compass.partidos.modelo.Associado;
import com.compass.partidos.repository.AssociadoRepository;

@RestController
@RequestMapping("/associados")
public class AssociadoController {
	
	@Autowired 
	private AssociadoRepository associadoRepository;
	
	@GetMapping
	@Cacheable(value = "listaDeAssociados")
	public List<AssociadoDto> listaAssociado(String cargoPolitico){
		if(cargoPolitico == null) {
			List<Associado>associados = associadoRepository.findAll();
			return AssociadoDto.converter(associados);
		} else {
			List<Associado>associados = associadoRepository.findByCargoPolitico(cargoPolitico);
			return AssociadoDto.converter(associados);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Associado> detalhar(@PathVariable Long id){
		Optional<Associado> associado = associadoRepository.findById(id);
		if(associado.isPresent()) {
			return ResponseEntity.ok(associado.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDeAssociados", allEntries = true)
	public ResponseEntity<AssociadoDto> cadastrarAssociado(@RequestBody @Valid AssociadoForm associadoForm, UriComponentsBuilder uriBuilder){
		Associado associado = associadoForm.converter(associadoForm);
		associadoRepository.save(associado);
		
		URI uri = uriBuilder.path("/associados/{id}").buildAndExpand(associado.getId()).toUri();
		return ResponseEntity.created(uri).body(new AssociadoDto(associado));
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeAssociados", allEntries = true)
	public ResponseEntity<AssociadoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AssociadoForm associadoForm) {
		Optional<Associado> associadoOptional = associadoRepository.findById(id);
		if (associadoOptional.isPresent()) {
			Associado associado = associadoForm.atualizar(id, associadoForm);
			associadoRepository.save(associado);
			return ResponseEntity.ok(new AssociadoDto(associado));
		}
		return ResponseEntity.notFound().build();
	}
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDePartidos", allEntries = true)
	public ResponseEntity<AssociadoDto> remover(@PathVariable Long id) {
		Optional<Associado> optional = associadoRepository.findById(id);
		if (optional.isPresent()) {
			associadoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
