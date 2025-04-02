package com.company.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private Integer qttAvaliable;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	public Product(String name, String description, BigDecimal price, Integer qttAvaliable) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.qttAvaliable = qttAvaliable; 
	}
	
	public Product() {	
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
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQttAvaliable() {
		return qttAvaliable;
	}

	public void setQttAvaliable(Integer qttAvaliable2) {
		this.qttAvaliable = qttAvaliable2;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
		
}
