package com.company;

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage", 7.75);
        super.addTopping1("Fries", 1.25);
        super.addTopping2("Coke", 1.25);
    }

    @Override
    public void addTopping1(String topping1, double price1) {
        System.out.println("Cannot add any additional toppings.");
    }

    @Override
    public void addTopping2(String topping2, double price2) {
        System.out.println("Cannot add any additional toppings.");
    }

    @Override
    public void addTopping3(String topping3, double price3) {
        System.out.println("Cannot add any additional toppings.");
    }

    @Override
    public void addTopping4(String topping4, double price4) {
        System.out.println("Cannot add any additional toppings.");
}
