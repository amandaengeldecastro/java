package com.task4.controller.form;

import javax.validation.Valid;

import com.task4.modelo.Dados;
import com.task4.modelo.Gender;

public class DadosForm {

	private Long empNo;
	private String firstName;
	private String lastName;	
	private Gender gender;
	
	public DadosForm() {
		
	}
	
	public Dados converter(@Valid DadosForm form) {
		Dados dados = new Dados(empNo, firstName, firstName, gender);
		return dados;
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
	
	
	
}
