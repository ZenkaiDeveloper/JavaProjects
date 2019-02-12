package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private ArrayList<Contact> contacts;

    public MobilePhone(String name) {
        this.name = name;
        this.contacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact){
        return contacts.indexOf(contact);
    }
    //Overload
    private int findContact(String contactName){
        for(int i=0;i<this.contacts.size();i++){
            String name = contacts.get(i).getName();
            if(name.equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void addToContacts(Contact newContact){
        if(findContact(newContact.getName()) >= 0 ){
            System.out.println("Contact already in system");
        }else{
            contacts.add(newContact);
        }

    }

    public void updateContact(String name, Contact updatedContact){
        int nameIndex = findContact(name);
        if(nameIndex >= 0 ){
            contacts.set(nameIndex, updatedContact);
        }else{
            System.out.println("Contact not found in your contact list.");
        }
    }

    public void removeContact(String name){
        int nameIndex = findContact(name);
        if(nameIndex >= 0 ){
            contacts.remove(contacts.get(nameIndex));
        }else{
            System.out.println("Contact not found in your contact list.");
        }
    }

    public void searchContact(String name){
        int nameIndex = findContact(name);
        if(nameIndex >= 0 ){
            System.out.println(contacts.get(nameIndex).getNumber());
        }else{
            System.out.println("Contact not found in your contact list.");
        }
    }

    public void printContactList(){
        if(this.contacts.size() == 0){
            System.out.println("Empty Contact list, please add someone.");
        }
        for(int i=0;i<this.contacts.size(); i++){
            System.out.println(i+1 + ". " + contacts.get(i).getName() + " - " + contacts.get(i).getNumber());
        }
    }




}
