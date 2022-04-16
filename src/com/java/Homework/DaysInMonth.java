package com.java.Homework;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){

        String[] nameOfMonths = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month in digits 1 - 12: ");

        int i = sc.nextInt();
        System.out.println("Days in "+ nameOfMonths[i-1] + " is " + daysInMonths[i-1]);

        if (i == 2){
            System.out.println("Or 29 days on leap years.");}

    }
}
