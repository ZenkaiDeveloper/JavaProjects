package com.company;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone andysPhone = new MobilePhone("andysPhone");

    private static void  printInstructions(){
        System.out.println("To see menu press 0.");
        System.out.println("To Show all contacts press 1.");
        System.out.println("To add contact press 2.");
        System.out.println("To Update a contact press 3.");
        System.out.println("To remove a contact press 4.");
        System.out.println("To search a contact press 5.");
        System.out.println("To Quit press 6.");
    }

    private static void addContact(){
        System.out.println("Enter a name to add to your contacts :");
        String name = scanner.nextLine();
        System.out.println("Enter a number to add to that name :");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name, number);
        andysPhone.addToContacts(newContact);
        andysPhone.printContactList();
    }

    private static void updateContact(){
        System.out.println("Enter a name in your contacts to edit :");
        String name = scanner.nextLine();
        System.out.println("Enter a new name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter a new number : ");
        String newNumber = scanner.nextLine();
        Contact newContact = new Contact(newName, newNumber);
        andysPhone.updateContact(name, newContact);
        andysPhone.printContactList();
    }

    private static void removeContact(){
        System.out.println("Enter a name in your contacts to delete :");
        String name = scanner.nextLine();
        andysPhone.removeContact(name);
        andysPhone.printContactList();
    }

    private static void searchContact(){
        System.out.println("Enter a name in your contacts to lookup :");
        String name = scanner.nextLine();
        andysPhone.searchContact(name);
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
                    andysPhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
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
