package com.company.controller.dto;

import java.math.BigDecimal;

import org.springframework.data.domain.Page;

import com.company.model.Product;

public class ProductDto {

	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private Integer qttAvaliable;
	
	public ProductDto(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.price = product.getPrice();
		this.qttAvaliable = product.getQttAvaliable();
	}
	
	public static Page<ProductDto> converter(Page<Product> produtos) {
		return produtos.map(ProductDto::new);
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

	public void setQttAvaliable(Integer qttAvaliable) {
		this.qttAvaliable = qttAvaliable;
	}
	
}
