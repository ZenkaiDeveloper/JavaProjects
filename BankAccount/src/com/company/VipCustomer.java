package com.company;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;


    VipCustomer(String name, String creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    VipCustomer(String name, String creditLimit){
        this(name, creditLimit, "example@example.com");
    }

    VipCustomer(){
        this("default name", "0", "example@example.com");
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
