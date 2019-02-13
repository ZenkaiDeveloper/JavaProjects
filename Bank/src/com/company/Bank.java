package com.company;

import java.util.ArrayList;

public class Bank {
    private  String name;
    private ArrayList<Branch> branches;

    Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void listBranches(){
        if(branches.size() > 0){
            for(int i=0;i<branches.size();i++){
                System.out.println(i+1 + " " + branches.get(i).getLocation());
            }
        }else{
            System.out.println("Please add branches");
        }

    }

    public void addBranch(Branch branch){
        if(getBranch(branch) != -1){
            System.out.println("Branch Location already added. Did not add new Branch");
        }else{
            branches.add(branch);
        }
    }

    public int getBranch(Branch branch){
        for(int i=0;i<branches.size();i++){
            Branch currentBranch = branches.get(i);
            if (currentBranch.getLocation().equals(branch.getLocation())){
                return i;
            }
        }
        return -1;
    }

    public Branch getBranch(String location){
        for(int i=0;i<branches.size();i++){
            Branch currentBranch = branches.get(i);
            if (currentBranch.getLocation().equals(location)){
                return currentBranch;
            }
        }
        System.out.print("No Branches Found in that location");
        return null;
    }


}
