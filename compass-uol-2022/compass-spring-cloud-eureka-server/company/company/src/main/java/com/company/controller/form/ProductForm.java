package com.company.controller.form;

import java.math.BigDecimal;

import javax.validation.Valid;

import com.company.model.Company;
import com.company.model.Product;

public class ProductForm{
	
	private String name;
	private String description;
	private BigDecimal price;
	private Integer qttAvaliable;
	
	public ProductForm() {
		
	}
	public Product update(Product product) {
		product.setName(this.name);
		product.setDescription(this.description);
		product.setPrice(this.price);
		product.setQttAvaliable(this.qttAvaliable);
		return product;
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
	public void setQttAvaliable(Integer qttAvaliable) {
		this.qttAvaliable = qttAvaliable;
	}
	public Product converter(@Valid ProductForm form) {
		return new Product(name, description, price, qttAvaliable);
		
	}

}