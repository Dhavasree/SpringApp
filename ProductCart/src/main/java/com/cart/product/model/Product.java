package com.cart.product.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Model_Name")
	private String model;
	@Column(name = "BRAND_NAME")
	private String brand_name;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PRICE")
	private Float price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
