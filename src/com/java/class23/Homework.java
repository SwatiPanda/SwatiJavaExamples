package com.java.class23;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============Array Homework=============");
        System.out.println("How many numbers you want in your array?");
        int length = sc.nextInt();
        int[] myArray = new int[length];
        double sum = 0;
        for(int i = 0; i<length; i++){
            System.out.println("Enter array element #" +(i+1));
            myArray[i] = sc.nextInt();
            sum += myArray[i];
        }
        System.out.println("Sum of all numbers entered is: "+ sum);
        System.out.println("Average is: "+ (sum/length));
        System.out.println("Enter the number you want to find index of: ");
        int num = sc.nextInt();
        for(int i = 0; i<length; i++){
            if(num == myArray[i]){
                System.out.println("Index of "+num+" is "+i);
                break;
            }

        }

    }
}
