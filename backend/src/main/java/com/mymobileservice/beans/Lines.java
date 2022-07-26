package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id
	private String phonenumber;
	@OneToOne(optional=false)
	@JoinColumn(name="phoneid")
	private Phone phoneid; // aka phone information
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;

	@OneToOne(optional=false)
	@JoinColumn(name="planid")
	private Plans plans;
	@ManyToOne(optional=false)
	@JoinColumn(name="id")
	private Account accountid;
	@Column
	private double monthphonepay;
	
	public Lines() { }

	public Lines(String phonenumber, Account accountid, Phone phoneid, String calleridname, Double remphonebal, Plans plans, Double monthphonepay) {
		super();
		this.phonenumber = phonenumber;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plans = plans;
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

	public void setAccountid(Account accountid) {
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

	public Plans getPlans() {
		return plans;
	}

	public void setPlans(Plans plans) {
		this.plans = plans;
	}

	public double getMonthphonepay() {
        return monthphonepay;
    }

    public void setMonthphonepay(double monthphonepay) {
        this.monthphonepay = monthphonepay;
    }

	@Override
	public String toString() {
		return "Line: [Account: " + accountid + "], "
		+"Caller ID: " + calleridname + ", Phone Model: " + phoneid
				+ ", Phone Number: " + phonenumber + ",Plan: " + plans + ", Remaining Phone Balance:" + remphonebal + "Monthly Phone Payment: " + monthphonepay + ".";
	}
	



}
