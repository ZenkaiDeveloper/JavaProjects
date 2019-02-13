package com.company;

import java.util.ArrayList;

public class Branch {
    private String location;
    private ArrayList<Customer> customers;

    Branch(String location){
        this.location = location;
        this.customers = new ArrayList<Customer>();
    }

    public String getLocation() {
        return location;
    }

    public void initializeCustomer(String name, Double amount){
        if(getCustomer(name) != -1){
            System.out.println("Customer already exists in our system");
        }else{
            Customer customer = new Customer(name);
            customer.addTransaction(amount);
            customers.add(customer);
        }
    }

    public void listCustomers(){
        for(int i=0;i<customers.size(); i++){
            System.out.println(i+1+". " + customers.get(i).getName());
            customers.get(i).listTransactions();
        }
    }

    private int getCustomer(String name){
        for(int i=0;i<customers.size();i++){
            Customer currentCustomer = customers.get(i);
            if(currentCustomer.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
