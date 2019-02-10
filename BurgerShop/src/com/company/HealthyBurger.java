package com.company;

public class HealthyBurger  extends Burger{
    private String extraTopping1;
    private double extraPrice1;
    private double extraPrice2;
    private String extraTopping2;

    public HealthyBurger( String meat, double price) {
        super("Healthy","Brown Rye", meat , price);
    }

    public void addExtraTopping1(String name, double price){
        this.extraTopping1 = name;
        this.extraPrice1 = price;
    }

    public void addExtraTopping2(String name, double price){
        this.extraTopping2 = name;
        this.extraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.extraTopping1 != null) hamburgerPrice += extraPrice1;
        if(this.extraTopping2 != null) hamburgerPrice += extraPrice2;
        System.out.println("Final burger price is " + hamburgerPrice);
        return hamburgerPrice;
    }
}
