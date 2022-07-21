package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="line")
	private String phonenumber;
	@Column
	private Integer accountid;
	@Column
	@OneToOne
	@JoinColumn(name="phoneid")
	private Integer phoneid;
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;
	@Column
	@OneToOne
	@JoinColumn(name="planid")
	private String plan;
	
	public Lines() { }

	public Lines(String phonenumber, Integer accountid, Integer phoneid, String calleridname, Double remphonebal,
			String plan) {
		super();
		this.phonenumber = phonenumber;
		this.accountid = accountid;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plan = plan;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(Integer phoneid) {
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
