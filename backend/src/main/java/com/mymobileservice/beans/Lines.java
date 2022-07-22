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

import com.mymobileservice.models.LinesModel;

@Entity
@Table(name="phoneline")
public class Lines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String phonenumber;
	@OneToOne
	@JoinColumn(name="phoneid")
	private Phone phoneid; // aka phone information
	@Column
	private String calleridname;
	@Column
	private Double remphonebal;

	@OneToOne
	@JoinColumn(name="plan")
	private Plans plan;
	@ManyToOne
	@JoinColumn(name="accountid")
	private Account accountid;
	
	public Lines() { }

	public Lines(String phonenumber, Phone phoneid, String calleridname, Double remphonebal, Plans plan,
			Account accountid) {
		this.phonenumber = phonenumber;
		this.phoneid = phoneid;
		this.calleridname = calleridname;
		this.remphonebal = remphonebal;
		this.plan = plan;
		this.accountid = accountid;
	}

	public Lines(LinesModel line) {
		this.phonenumber = line.getPhonenumber();
		this.phoneid = line.getPhoneid();
		this.calleridname = line.getCalleridname();
		this.remphonebal = line.getRemphonebal();
		this.plan = line.getPlan();
		this.accountid = line.getAccountid();
	}

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

	public Phone getPhoneid() {
        return phoneid;
    }

	public void setPhoneid() {
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

	public Account getAccountid() {
        return accountid;
    }

    public void setAccountid(Account accountid) {
        this.accountid = accountid;
    }

	@Override
	public String toString() {
		return "Lines [accountid=" + accountid + ", calleridname=" + calleridname + ", phoneid=" + phoneid
				+ ", phonenumber=" + phonenumber + ", plan=" + plan + ", remphonebal=" + remphonebal + "]";
	}
	
}