package com.mymobileservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phoneinfo")
public class PhoneModel {

    @Id
    private int phoneid;
    @Column
    private String manufacterer;
    @Column
    private String model;
    @Column
    private String memory;
    @Column
    private int price;
    @Column
    private String colors;

    public PhoneModel(int phoneid, String manufacterer, String model, String memory, int price, String colors) {
        this.phoneid = phoneid;
        this.manufacterer = manufacterer;
        this.model = model;
        this.memory = memory;
        this.price = price;
        this.colors = colors;
    }

    public int getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }

    public String getManufacterer() {
        return manufacterer;
    }

    public void setManufacterer(String manufacterer) {
        this.manufacterer = manufacterer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Phone:  Made By " + manufacterer + ", the " + model +
                " is " + colors + ", with " + memory + "memory for $" + price + ".";
    }

}