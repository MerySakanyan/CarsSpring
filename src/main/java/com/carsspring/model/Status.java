package com.carsspring.model;

public enum Status {

    Unverified("Unverified"),
    Active("Active"),
    Blocked("Blocked");



    private String dsc;

    Status(String dsc) {
        this.dsc = dsc;
    }


    public String getDsc() {
        return dsc;
    }
}
