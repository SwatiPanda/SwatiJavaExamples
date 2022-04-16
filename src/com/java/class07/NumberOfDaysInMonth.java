package com.java.class07;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any month from January through December");
        String monthName = sc.nextLine();
        switch (monthName) {
            case "January":
                System.out.println("Number of days 31");
                break;
            case "February":
                System.out.println("Number of days 28 or 29");
                break;
            case "March":
                System.out.println("Number of days 31");
                break;
            case "April":
                System.out.println("Number of days 30");
                break;
            case "May":
                System.out.println("Number of days 31");
                break;
            case "June":
                System.out.println("Number of days 30");
                break;
            case "July":
                System.out.println("Number of days 31");
                break;
            case "August":
                System.out.println("Number of days 31");
                break;
            case "September":
                System.out.println("Number of days 30");
                break;
            case "October":
                System.out.println("Number of days 31");
                break;
            case "November":
                System.out.println("Number of days 30");
                break;
            case "December":
                System.out.println("Number of days 31");
                break;
            default:
                System.out.println("etnered invalid month type");
        }
    }


    }

