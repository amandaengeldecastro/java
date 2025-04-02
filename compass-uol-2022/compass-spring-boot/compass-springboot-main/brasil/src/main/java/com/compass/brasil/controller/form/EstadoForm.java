package com.compass.brasil.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.compass.brasil.modelo.Estado;
import com.compass.brasil.repository.EstadoRepository;

public class EstadoForm {
	
	@NotNull @NotEmpty @Length(min = 4)
	private String nome;
	@NotNull @NotEmpty 
	private String regiao;
	@NotNull 
	private long populacao;
	@NotNull @NotEmpty
	private String capital;
	@NotNull 
	private double area;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public Estado converter(EstadoForm estadoForm){
		return new Estado(estadoForm.getNome(), estadoForm.getRegiao(), estadoForm.getPopulacao(), 
				estadoForm.getCapital(), estadoForm.getArea());
	}
	
	public Estado atualizar(Long id, EstadoForm estadoForm) {
		 Estado estado = new Estado();
		 estado.setId(id);
		 estado.setNome(estadoForm.getNome());
		 estado.setRegiao(estadoForm.getRegiao());
		 estado.setPopulacao(estadoForm.getPopulacao());
		 estado.setCapital(estadoForm.getCapital());
		 estado.setArea(estadoForm.getArea());
		 return estado; 
	}
	
	 
}

