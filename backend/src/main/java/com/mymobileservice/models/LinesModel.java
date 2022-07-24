package com.mymobileservice.models;

import com.mymobileservice.beans.Lines;

public class LinesModel {
    
	private String phonenumber;
    private Integer accountid;
	private int phoneid; // aka phone information
	private String calleridname;
	private double remphonebal;
    private String plan;
    
    public LinesModel() {
        super();
    }

    public LinesModel(Lines lines) {
        this.phonenumber = lines.getPhonenumber();
        this.accountid = lines.getAccountid();
        this.phoneid = lines.getPhoneid();
        this.calleridname = lines.getCalleridname();
        this.remphonebal = lines.getRemphonebal();
        this.plan = lines.getPlan();
    }

    public LinesModel(String phonenumber, Integer accountid, int phoneid, String calleridname, double remphonebal,
            String plan) {
        this.phonenumber = phonenumber;
        this.accountid = accountid;
        this.phoneid = phoneid;
        this.calleridname = calleridname;
        this.remphonebal = remphonebal;
        this.plan = plan;
    }


    @Override
    public String toString() {
        return "LinesModel [calleridname=" + calleridname + ", phoneid=" + phoneid
                + ", phonenumber=" + phonenumber + ", plan=" + plan + ", remphonebal=" + remphonebal + "]";
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

    public int getPhoneid() {
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

    public double getRemphonebal() {
        return remphonebal;
    }

    public void setRemphonebal(double remphonebal) {
        this.remphonebal = remphonebal;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
