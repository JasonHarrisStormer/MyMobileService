package com.mymobileservice.models;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Lines;
import com.mymobileservice.beans.Phone;
import com.mymobileservice.beans.Plans;

public class LinesModel {
    
	private String phonenumber;
    private Account accountid;
	private Phone phoneid; // aka phone information
	private String calleridname;
	private double remphonebal;
    private Plans plan;
    
    public LinesModel() {
        super();
    }

    public LinesModel(Lines lines) {
        this.phonenumber = lines.getPhonenumber();
        //this.accountid = lines.getAccountid();
        this.phoneid = lines.getPhoneid();
        this.calleridname = lines.getCalleridname();
        this.remphonebal = lines.getRemphonebal();
        this.plan = lines.getPlan();
    }

    public LinesModel(String phonenumber, Account accountid, Phone phoneid, String calleridname, double remphonebal,
            Plans plan) {
        this.phonenumber = phonenumber;
        this.accountid = accountid;
        this.phoneid = phoneid;
        this.calleridname = calleridname;
        this.remphonebal = remphonebal;
        this.plan = plan;
    }


    @Override
    public String toString() {
        return "LinesModel [accountid=" + accountid + ", calleridname=" + calleridname + ", phoneid=" + phoneid
                + ", phonenumber=" + phonenumber + ", plan=" + plan + ", remphonebal=" + remphonebal + "]";
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

    public double getRemphonebal() {
        return remphonebal;
    }

    public void setRemphonebal(double remphonebal) {
        this.remphonebal = remphonebal;
    }

    public Plans getPlan() {
        return plan;
    }

    public void setPlan(Plans plan) {
        this.plan = plan;
    }

}
