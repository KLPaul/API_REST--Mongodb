package com.crud.m5a.models;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="products")
public class ProductDTO {
	
	@JsonProperty("_id")
	private String _id;
	private String name;
	private Double price;
	private LocalDate expiry_date;
	
	
	public String get_id() {
		return _id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public LocalDate getExpiry_date() {
		return expiry_date;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	

}
