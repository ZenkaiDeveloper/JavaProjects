package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public void addTransaction(Double amount){
        transactions.add(amount);
    }

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void listTransactions(){
        for(int i=0;i<transactions.size(); i++){
            System.out.print("Transaction "+ i+1 + " " + transactions.get(i));
        }
    }
}
