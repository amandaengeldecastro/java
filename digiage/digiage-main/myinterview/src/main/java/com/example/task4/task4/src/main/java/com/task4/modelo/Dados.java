package com.task4.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Dados {
	
	@Id
	private Long empNo;
	private String firstName;
	private String lastName;
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	public Dados() {
		
	}
	
	public Dados(Long empNo, String firstName, String lastName, Gender gender) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
