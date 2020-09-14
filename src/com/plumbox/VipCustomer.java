package com.plumbox;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public VipCustomer(String name, String emailAddress){
        this(name, 0.0, emailAddress);
    }

    public VipCustomer(){
        this("Connor",0.0,"connor.li@outlook.com");
    }
}
