package com.mymobileservice.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "phonelines")
public class LinesModel {

    @Id
    private String phonenumber;
    @Column
    private List accountid;
    @Column
    private List phoneid;
    @Column
    private String calleridname;
    @Column
    private double remphonebal;
    @Column
    private List plan;

    public LinesModel(String phonenumber, int accountid, List phoneid, String calleridname, double remphonebal,
            List plan) {
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

    public List getAccountid() {
        return accountid;
    }

    public void setAccountid(List accountid) {
        this.accountid = accountid;
    }

    public List getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(List phoneid) {
        this.phoneid = phoneid;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public double getRemphonebal() {
        return remphonebal;
    }

    public void setRemphonebal(double remphonebal) {
        this.remphonebal = remphonebal;
    }

    public List getPlan() {
        return plan;
    }

    public void setPlan(List plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Account: " + accountid.toString() + ", Caller ID Name=" + calleridname + ", Phone ID="
                + phoneid.toString()
                + ", Phone Number=" + phonenumber + ", Plan=" + plan.toString() + ", Balance Owed on this Phone: $"
                + remphonebal + ".";
    }

}
