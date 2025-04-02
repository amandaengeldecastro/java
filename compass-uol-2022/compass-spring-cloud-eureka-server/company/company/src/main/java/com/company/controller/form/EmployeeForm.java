package com.company.controller.form;

import com.company.model.Employee;

import javax.validation.Valid;

public class EmployeeForm {

	private String name;
	private Double salary;
	private String office;
	
	public EmployeeForm() {
	}

	public Employee update(Employee employee) {
		employee.setName(this.name);
		employee.setSalary(this.salary);
		employee.setOffice(this.office);
		return employee;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
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

	public Employee converter(@Valid EmployeeForm form) {
		return new Employee(name, salary, office);
	}
}
