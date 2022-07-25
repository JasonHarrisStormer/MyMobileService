package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id
	private String phonenumber;
	//@ManyToOne(targetEntity = Phone.class)
	//@JoinColumn(name="phoneid")
	private double phoneid; // aka phone information
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;

	//@ManyToOne(targetEntity = Plans.class)
	//@JoinColumn(name="planid")
	private String plan;
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name="id")
	private Account accountid;
	
	public Lines() { }

	public Lines(String phonenumber, Account accountid, double phoneid, String calleridname, Double remphonebal, String plan) {
		super();
		this.phonenumber = phonenumber;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plan = plan;
		this.accountid = accountid;
	}


	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Account getAccountid() {
		return accountid;
	}

	public void setAccountid(Account account) {
		this.accountid = account;
	}

	public double getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(double phoneid) {
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
	
}
