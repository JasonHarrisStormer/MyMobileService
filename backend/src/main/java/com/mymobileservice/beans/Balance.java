package com.mymobileservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="balance")
public class Balance {
    @Id
    private int accountid;
    @Column
    private double remphonebal;
    @Column
    private double planbal;
    @Column
    private double totalbal;

    public Balance(){}

    public Balance(int accountid, double remphonebal, double planbal, double totalbal) {
        this.accountid = accountid;
        this.remphonebal = remphonebal;
        this.planbal = planbal;
        this.totalbal = totalbal;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public double getRemphonebal() {
        return remphonebal;
    }

    public void setRemphonebal(double remphonebal) {
        this.remphonebal = remphonebal;
    }

    public double getPlanbal() {
        return planbal;
    }

    public void setPlanbal(double planbal) {
        this.planbal = planbal;
    }

    public double getTotalbal() {
        return totalbal;
    }

    public void setTotalbal(double totalbal) {
        this.totalbal = totalbal;
    }


    
}
