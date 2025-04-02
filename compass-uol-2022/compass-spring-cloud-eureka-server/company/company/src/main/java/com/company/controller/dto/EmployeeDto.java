package com.company.controller.dto;

import org.springframework.data.domain.Page;

import com.company.model.Employee;

public class EmployeeDto {
	
	private Long id;
	private String name;
	private Double salary;
	private String office;
	
	
	public EmployeeDto(Employee employee){
		this.id = employee.getId();
		this.name = employee.getName();
		this.salary = employee.getSalary();		
		this.office = employee.getOffice();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}

	public static Page<EmployeeDto> converter(Page<Employee> employees) {
		return employees.map(EmployeeDto::new);
	}
	
	
}
