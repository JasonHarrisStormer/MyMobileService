package com.mymobileservice.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Max;
import javax.persistence.Min;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String email;
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
    @Max(2)
    @Min(0)
    private String state;
    @Column
    @Max(10)
    @Min(5)
    private int zipcode;
    @Column
    private List lines;
    @Column
    private int password;

    public AccountModel(String email, String firstname, String lastname, String address, String address2, String city,
            String state, int zipcode, List lines, int password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.lines = lines;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public List getLines() {
        return lines;
    }

    public void setLines(List lines) {
        this.lines = lines;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public int hashCode() { // hasing the login info
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public String toString() {
        return "Account ID : " + id + ", First Name : " + firstname
                + ", Last Name=" + lastname + "Address : " + address + ", Address 2 : " + address2 + ", City : " + city
                + ", State: " + state + ", Zip Code: " + zipcode + ", Lines On This Account : " + lines.toString()
                + ".";
    }

}
