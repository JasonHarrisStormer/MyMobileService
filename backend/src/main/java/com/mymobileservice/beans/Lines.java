package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="phonenumber")
	private Lines phonenumber;
	@Column
	private Integer accountid;
	@OneToOne
	@JoinColumn(name="phoneid")
	private Phone phoneid;
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;

	@OneToOne
	@JoinColumn(name="plan")
	private Plans plan;
	
	public Lines() { }

	public Lines(Lines phonenumber, Integer accountid, Phone phoneid, String calleridname, Double remphonebal,
			Plans plan) {
		super();
		this.phonenumber = phonenumber;
		this.accountid = accountid;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plan = plan;
	}

	public Lines getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Lines phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Phone getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(Phone phoneid) {
		this.phoneid = phoneid;
	}

	public String getCalleridname() {
		return calleridname;
	}

	public void setCalleridname(String calleridname) {
		this.calleridname = calleridname;
	}

	public Double getRemphonebal() {
		return remphonebal;
	}

	public void setRemphonebal(Double remphonebal) {
		this.remphonebal = remphonebal;
	}

	public Plans getPlan() {
		return plan;
	}

	public void setPlan(Plans plan) {
		this.plan = plan;
	}
	
}
