package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phoneinfo")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer phoneid;
	@Column
	private String manufacterer;
	@Column
	private String model;
	@Column
	private String memory;
	@Column
	private Double price;
	@Column
	private String color;
	
	public Phone() { }

	public Phone(Integer phoneid, String manufacterer, String model, String memory, Double price, String color) {
		super();
		this.phoneid = phoneid;
		this.manufacterer = manufacterer;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.color = color;
	}

	public Integer getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(Integer phoneid) {
		this.phoneid = phoneid;
	}

	public String getManufacterer() {
		return manufacterer;
	}

	public void setManufacterer(String manufacterer) {
		this.manufacterer = manufacterer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
