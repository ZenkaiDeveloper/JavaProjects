package com.company;

public class Burger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    public Burger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    private String topping1;
    private double price1;

    private String topping2;
    private double price2;

    private String topping3;
    private double price3;

    private String topping4;
    private double price4;

    public void addTopping1(String topping1, double  price1){
        this.topping1 = topping1;
        this.price1 = price1;
    }

    public void addTopping2(String topping2, double  price2){
        this.topping2 = topping2;
        this.price2 = price2;
    }

    public void addTopping3(String topping3, double  price3){
        this.topping3 = topping3;
        this.price3 = price3;
    }

    public void addTopping4(String topping4, double  price4){
        this.topping4 = topping4;
        this.price4 = price4;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger"+" on a " + this.breadRoll+" roll" + " price is " + this.price);
        if(this.topping1 != null){
            hamburgerPrice += price1;
            System.out.println("Added " + this.topping1 + " for an additional "+this.price1+".");
        }
        if(this.topping2 != null){
            hamburgerPrice += price2;
            System.out.println("Added " + this.topping2 + " for an additional "+this.price2+".");
        }
        if(this.topping3 != null){
            hamburgerPrice += price3;
            System.out.println("Added " + this.topping3 + " for an additional "+this.price3+".");
        }
        if(this.topping4 != null){
            hamburgerPrice += price4;
            System.out.println("Added " + this.topping4 + " for an additional "+this.price4+".");
        }
        return hamburgerPrice;
    }

}
