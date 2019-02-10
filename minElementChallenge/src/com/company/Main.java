package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[]  intArr = readIntegers(5);
        System.out.println(findMin(intArr));

    }

    private static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Enter numbers to insert into array");
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr){
        if(arr.length <=  0) return -1;
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            min  = Math.min(min, arr[i]);
        }
        return  min;
    }
}
