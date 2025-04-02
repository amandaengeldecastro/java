package com.task4.controller.dto;

import org.springframework.data.domain.Page;

import com.task4.modelo.Dados;
import com.task4.modelo.Gender;

public class DadosDto {

	private Long empNo;
	private String firstName;
	private String lastName;	
	private Gender gender;
	
	public DadosDto() {
		
	}
	
	public DadosDto(Dados dados) {
		this.empNo = dados.getEmpNo();
		this.firstName = dados.getFirstName();
		this.lastName = dados.getLastName();
		this.gender = dados.getGender();
	}
	
	public Long getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static Page<DadosDto> converter(Page<Dados> dados) {
		return dados.map(DadosDto::new);
	}
	
	
	
	
}
