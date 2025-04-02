package com.task4.controller;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.task4.controller.dto.DadosDto;
import com.task4.controller.form.DadosForm;
import com.task4.modelo.Dados;
import com.task4.repository.DadoRepository;

@RestController
@RequestMapping("/dados")
public class DadosController {

	@Autowired
	private DadoRepository dRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<DadosDto> cadastrarDados(@RequestBody @Valid DadosForm form, UriComponentsBuilder uriBuilder){
		Dados dados = form.converter(form);
		dRepository.save(dados);
		
		URI uri = uriBuilder.path("/dados/{empNo}").buildAndExpand(dados.getEmpNo()).toUri();
		return ResponseEntity.created(uri).body(new DadosDto(dados));
	}
	
	@GetMapping("/recordsForGender/{gender}")
	public Page<DadosDto> buscarPorAutor(@PathVariable String gender,
		@PageableDefault(sort="id", direction= Direction.ASC,page=0, size=10)Pageable paginacao) {
		Page<Dados> dados = dRepository.findByGenderContainingIgnoreCase(gender, paginacao);

		return DadosDto.converter(dados);


	}
	
}
