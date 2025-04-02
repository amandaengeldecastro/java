package com.compass.brasil.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import com.compass.brasil.modelo.Estado;

public class EstadoDto {
	
	private Long id;
	private String nome;
	private String regiao; 
	private long populacao;
	private String capital;
	private double area;
	
	public EstadoDto(Estado estado){
		this.id= estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getNome();
		this.populacao = estado.getPopulacao(); 
		this.capital = estado.getCapital();
		this.area = estado.getArea();	
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public long getPopulacao() {
		return populacao;
	}
	public String getCapital() {
		return capital;
	}
	public double getArea() {
		return area;
	}

	public static Page<EstadoDto> converter(Page<Estado> estado) {
		return estado.map(EstadoDto::new);
	}

	public static List<EstadoDto> converter(List<Estado> estados) {
		return estados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}	
	

}