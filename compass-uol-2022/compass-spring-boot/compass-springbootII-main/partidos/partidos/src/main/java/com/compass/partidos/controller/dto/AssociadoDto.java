package com.compass.partidos.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.compass.partidos.modelo.Associado;
import com.compass.partidos.modelo.CargoPolitico;
import com.compass.partidos.modelo.Sexo;

public class AssociadoDto {
	private Long id;
	private String nomeAssociado;
	private CargoPolitico cargoPolitico;
	private LocalDate dataNascimento;
	private Sexo sexo;
	
	public AssociadoDto(Associado associado) {
		this.id = associado.getId();
		this.nomeAssociado = associado.getNomeAssociado();
		this.cargoPolitico = associado.getCargoPolitico();
		this.dataNascimento = associado.getDataNascimento();
	}
	
	public Long getId() {
		return id;
	}
	public String getNomeAssociado() {
		return nomeAssociado;
	}
	public CargoPolitico getCargoPolitico() {
		return cargoPolitico;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	

	public static List<AssociadoDto> converter(List<Associado> associados) {
		return associados.stream().map(AssociadoDto::new).collect(Collectors.toList());

	}
}
