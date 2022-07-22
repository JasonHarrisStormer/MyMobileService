package com.mymobileservice.models;

public class PlansModel {
	
	private int planid;
	private String name;
	private Double price;
	private Integer linelimit;
	private Double aboveextralinelimit;
	private Double extraline;
	
	public PlansModel() { }

	public PlansModel(int planid, String name, Double price, Integer linelimit, Double aboveextralinelimit,
			Double extraline) {
		super();
		this.planid = planid;
		this.name = name;
		this.price = price;
		this.linelimit = linelimit;
		this.aboveextralinelimit = aboveextralinelimit;
		this.extraline = extraline;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getLinelimit() {
		return linelimit;
	}

	public void setLinelimit(Integer linelimit) {
		this.linelimit = linelimit;
	}

	public Double getAboveextralinelimit() {
		return aboveextralinelimit;
	}

	public void setAboveextralinelimit(Double aboveextralinelimit) {
		this.aboveextralinelimit = aboveextralinelimit;
	}

	public Double getExtraline() {
		return extraline;
	}

	public void setExtraline(Double extraline) {
		this.extraline = extraline;
	}
	
}
