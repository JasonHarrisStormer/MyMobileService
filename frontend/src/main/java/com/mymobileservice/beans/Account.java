package com.mymobileservice.beans;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

  @ID
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
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
  private int zipcode;
  @Column
  private String linesString;
  @Column
  private String password;

  public Account(int id, String firstname, String lastname, String address, String address2, String city, String state,
      int zipcode, String linesString, String password) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.address2 = address2;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.linesString = linesString;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public int getZipcode() {
    return zipcode;
  }

  public void setZipcode(int zipcode) {
    this.zipcode = zipcode;
  }

  public String getLinesString() {
    return linesString;
  }

  public void setLinesString(String linesString) {
    this.linesString = linesString;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Account [ID : " + id + ", First Name : " + firstname
        + ", Last Name=" + lastname + "Address : " + address + ", Address 2 : " + address2 + ", City : " + city +
        ", state=" + state + ", zipcode=" + zipcode + ", Lines On This Account : " + linesString + "]";
  }

}
