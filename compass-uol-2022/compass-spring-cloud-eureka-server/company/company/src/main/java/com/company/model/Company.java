package com.company.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Name;
	private String adress;
	
	@OneToMany(
			mappedBy = "company", 
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Product> products;
	
	@OneToMany(
			mappedBy = "company", 
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Employee> employees;
	
	public Company() {
		
	}
		
	public Company(String Name, String adress) {
		super();
		this.Name = Name;
		this.adress = adress;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getadress() {
		return adress;
	}
	public void setadress(String adress) {
		this.adress = adress;
	}
	public List<Product> getproducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
