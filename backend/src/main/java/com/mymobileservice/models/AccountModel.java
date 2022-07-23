package com.mymobileservice.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Lines;

public class AccountModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column
	private String firstname;
    @Column
	private String lastname;
    @Column
	private String address;
    @Column
	private String address2;
    @Column
	private String city;
    @Column
	private String state;
    @Column
	private Integer zipcode;
    @Column
	private String email;
    @OneToMany(mappedBy = "account")
    private Set<LinesModel> line;
    
    public AccountModel() {	}

	public AccountModel(Account account) {
		super();
		this.id = account.getId();
		this.firstname = account.getFirstname();
		this.lastname = account.getLastname();
		this.address = account.getAddress();
		this.address2 = account.getAddress2();
		this.city = account.getCity();
		this.state = account.getState();
		this.zipcode = account.getZipcode();
		this.email = account.getEmail();

        Set<LinesModel> newLines = new HashSet<LinesModel>();
        if(account.getLine() != null){
            for (Lines lines2 : account.getLine()) {
                newLines.add(new LinesModel(lines2));
            }
        }
        this.line = newLines;
		
	}

    public AccountModel(Integer id, String firstname, String lastname, String address, String address2, String city,
			String state, Integer zipcode, String email, Set<LinesModel> line) {
                super();
                this.id = id;
                this.firstname = firstname;
                this.lastname = lastname;
                this.address = address;
                this.address2 = address2;
                this.city = city;
                this.state = state;
                this.zipcode = zipcode;
                this.email = email;
                this.line = line;
		
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set<LinesModel> getLine() {
        return line;
    }

    public void setLine(Set<LinesModel> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "AccountModel [address=" + address + ", address2=" + address2 + ", city=" + city + ", email=" + email
                + ", firstname=" + firstname + ", id=" + id + ", lastname=" + lastname + ", line=" + line + ", state="
                + state + ", zipcode=" + zipcode + ", lines=" + line + ",]";
    }
    
}
