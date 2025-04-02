package com.compass.partidos.controller.form;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.compass.partidos.modelo.Associado;
import com.compass.partidos.modelo.CargoPolitico;
import com.compass.partidos.modelo.Sexo;

public class AssociadoForm {
	
	@NotNull @NotEmpty
	private String nomeAssociado;
	private CargoPolitico cargoPolitico;
	private LocalDate dataNascimento;
	private Sexo sexo;
	
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
	
	public Associado converter(AssociadoForm associadoForm) {
		return new Associado(associadoForm.getNomeAssociado(), associadoForm.getCargoPolitico(), associadoForm.getDataNascimento(), associadoForm.getSexo());
	}
	public Associado atualizar(Long id, @Valid AssociadoForm associadoForm) {
		Associado associado = new Associado();
		associado.setId(id);
		associado.setNomeAssociado(nomeAssociado);		
		associado.setCargoPolitico(cargoPolitico);
		associado.setDataNascimento(dataNascimento);
		associado.setSexo(sexo);
		return associado;
	}
	
}
