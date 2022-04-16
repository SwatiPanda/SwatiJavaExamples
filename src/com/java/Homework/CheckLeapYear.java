package com.java.Homework;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a valid year");
        int Year = sc.nextInt();
        //Leap year is divisible by 4. A Century is a leap year only if it is divisible by 100 and 400 both.
        if(Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println(Year + " is a leap year");}
                else {
                    System.out.println(Year + " is a not leap year");}
            }
            else {
                System.out.println(Year + " is a leap year");}
        }
        else {
            System.out.println(Year+" is a not leap year");}

        System.out.println("End Program.");

        }
}
