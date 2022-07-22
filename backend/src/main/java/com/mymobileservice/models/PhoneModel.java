package com.mymobileservice.models;

import java.util.List;

import com.mymobileservice.beans.Phone;

public class PhoneModel {
    
	private Integer phoneid;
	private String manufacterer;
	private String model;
	private String memory;
	private Double price;
	private String color;
	private List<String> ColorList;
	
	public PhoneModel() { }

	public PhoneModel(Integer phoneid, String manufacterer, String model, 
			String memory, Double price, String color) {
        super();        
		this.phoneid = phoneid;
		this.manufacterer = manufacterer;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.color = color;
		
	}

    public PhoneModel(Phone phone) {
        super();        
		this.phoneid = phone.getPhoneid();
		this.manufacterer = phone.getManufacterer();
		this.model = phone.getModel();
		this.memory = phone.getMemory();
		this.price = phone.getPrice();
		this.color = phone.getColor();
		
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

    public List<String> getColorList() {
        return ColorList;
    }

    public void setColorList(List<String> ColorList) {
        this.ColorList = ColorList;
    }

}
