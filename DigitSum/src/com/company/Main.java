package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digitSum(1234));
    }

    public static int digitSum(int number){
        int sum = 0;
        int num = number;
        if(number < 10 || number < 0){
            return -1;
        }else{
            while(num%10 >= 1){
                sum += num%10;
                num = num/10;
            }
        }
        return sum;
    }
}
