package com.company;

import java.util.Scanner;

public class Main {
    private static Bank citi = new Bank("Citi");
    private static Scanner scanner = new Scanner(System.in);

    private static void  printInstructions(){
        System.out.println("To see menu press 0.");
        System.out.println("To See all branches press 1.");
        System.out.println("To Add a branch press 2.");
        System.out.println("To Add a Customer with Transaction press 3.");
        System.out.println("To add a transaction to a customer press 4.");
        System.out.println("To See all transactions and customers for a branch press 5.");
        System.out.println("To Quit press 6.");
    }

    private static void listAllBranches(){
        citi.listBranches();
    }

    private static void addBranch(){
        System.out.println("Enter the Location of your new Branch");
        String location = scanner.nextLine();
        Branch newBranch = new Branch(location);
        citi.addBranch(newBranch);
    }

    private static void addCustomer(){
        System.out.println("Enter name of branch to add customer: ");
        String branchLocation = scanner.nextLine();
        Branch location = citi.getBranch(branchLocation);
        if (location != null){
            System.out.println("Location found at " + location.getLocation());
            System.out.println("Enter name of new customer");
            String customerName = scanner.nextLine();
            System.out.println("How much to initialize account?");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            location.initializeCustomer(customerName, amount);

        }
    }

    private static void viewCustomer(){
        System.out.println("Enter name of branch to view customers: ");
        String branchLocation = scanner.nextLine();
        Branch location = citi.getBranch(branchLocation);
        if(location != null){
            location.listCustomers();
        }else{
            System.out.println("Cannot find the branch you are looking for.");
        }
    }

    private static void addTransaction(){
        System.out.println("Enter name of the customer you like to add funds to: ");
        String customerName = scanner.nextLine();

    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    listAllBranches();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    viewCustomer();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    printInstructions();
            }

        }
    }
}
