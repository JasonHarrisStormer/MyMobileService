package com.mymobileservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private String address;
    private String address2;
    private String city;
    private String state;
    private Integer zipcode;
    
}
