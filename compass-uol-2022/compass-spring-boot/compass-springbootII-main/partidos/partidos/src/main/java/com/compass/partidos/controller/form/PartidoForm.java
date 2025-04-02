package com.compass.partidos.controller.form;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.compass.partidos.modelo.Ideologia;
import com.compass.partidos.modelo.Partido;

public class PartidoForm {
	
	@NotNull @NotEmpty
	private String nomePartido;
	@NotNull @NotEmpty
	private String sigla;
	private Ideologia ideologia;
	private LocalDate dataFundacao;
	
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Ideologia getIdeologia() {
		return ideologia;
	}
	public void setIdeologia(Ideologia ideologia) {
		this.ideologia = ideologia;
	}
	public LocalDate getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public Partido converter(PartidoForm partidoForm) {
		return new Partido(partidoForm.getNomePartido(), partidoForm.getSigla(), partidoForm.getIdeologia(), partidoForm.getDataFundacao());
	}
	public Partido atualizar(Long id, @Valid PartidoForm partidoForm) {
		Partido partido = new Partido();
		partido.setId(id);
		partido.setNomePartido(nomePartido);
		partido.setSigla(sigla);
		partido.setIdeologia(ideologia);
		partido.setDataFundacao(dataFundacao);
		return partido;
	}
	
}
