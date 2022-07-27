package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id //laying out the table columns as private variables
	private String phonenumber;
	// @OneToOne(mappedBy = "lines")
	// @JoinColumn(name="phoneid")
	private double phoneid; // aka phone information
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;

	// @OneToOne(mappedBy = "lines")
	// @JoinColumn(name="planid")
	private String plan;
	@ManyToOne
	@JoinColumn(name="accountid")
	@JsonBackReference("accountLines")
	private Account account;
	
	public Lines() { }

	public Lines(String phonenumber, Account account, double phoneid, String calleridname, Double remphonebal, String plan) {
		super();
		this.phonenumber = phonenumber;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plan = plan;
		this.account = account;
	}


	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
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

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Line: [Account: " + account + "], "
		+"Caller ID: " + calleridname + ", Phone Model: " + phoneid
				+ ", Phone Number: " + phonenumber + ",Plan: " + plan + ", Remaining Phone Balance:" + remphonebal + ".";
	}
	
}
