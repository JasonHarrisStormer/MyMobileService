package com.mymobileservice.models;

public class PlansModel {

    private int id;
    private String name;
    private double price;
    private int linelimit;
    private double extraline;
    private double aboveextraline;

    public PlansModel(int id, String name, double price, int linelimit, double extraline, double aboveextraline) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.linelimit = linelimit;
        this.extraline = extraline;
        this.aboveextraline = aboveextraline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLinelimit() {
        return linelimit;
    }

    public void setLinelimit(int linelimit) {
        this.linelimit = linelimit;
    }

    public double getExtraline() {
        return extraline;
    }

    public void setExtraline(double extraline) {
        this.extraline = extraline;
    }

    public double getAboveextraline() {
        return aboveextraline;
    }

    public void setAboveextraline(double aboveextraline) {
        this.aboveextraline = aboveextraline;
    }

    @Override
    public String toString() {
        return "Plan ID :" + id
                + " Name: " + name + ", Price: $" + price + ", Number of Lines Allowed: " + linelimit
                + ", Monthly Price Per Extra Allowed Line: $" + extraline
                + ", Monthly Price Per Line Over the Line Limit: $" + aboveextraline + ", .";
    }

}
