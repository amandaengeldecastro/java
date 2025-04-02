package com.compass.partidos.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associado{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAssociado;
	@Enumerated(value = EnumType.STRING)
	private CargoPolitico cargoPolitico;
	private LocalDate dataNascimento;
	@Enumerated(value = EnumType.STRING)
	private Sexo sexo;
		
	public Associado(){
	}
	
	public Associado(String nomeAssociado, CargoPolitico cargoPolitico, LocalDate dataNascimento, Sexo sexo) {
		this.nomeAssociado = nomeAssociado;
		this.cargoPolitico = cargoPolitico;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAssociado() {
		return nomeAssociado;
	}
	public void setNomeAssociado(String nomeAssociado) {
		this.nomeAssociado = nomeAssociado;
	}
	public CargoPolitico getCargoPolitico() {
		return cargoPolitico;
	}
	public void setCargoPolitico(CargoPolitico cargoPolitico) {
		this.cargoPolitico = cargoPolitico;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
}
