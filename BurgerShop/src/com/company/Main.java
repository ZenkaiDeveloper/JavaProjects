package com.company;

public class Main {

    public static void main(String[] args) {
	 Burger burger = new Burger("basic", "White", "Pork", 5.25);
	 burger.addTopping1("lettuce", 0.5);
	 burger.addTopping2("tomato", 0.2);
	 burger.addTopping3("BBQ", 0.1);


	 double price = burger.itemizeHamburger();

	 HealthyBurger healthyBurger = new HealthyBurger("veggie", 3.90);
	 healthyBurger.addTopping1("lettuce", 1);
	 healthyBurger.addExtraTopping1("extra one", 2.01);
	 healthyBurger.itemizeHamburger();
    }
}
