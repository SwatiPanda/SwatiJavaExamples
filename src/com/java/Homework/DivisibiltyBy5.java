package com.java.Homework;

import java.util.Scanner;

public class DivisibiltyBy5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any valid integer");
        int Num = sc.nextInt();
        if (Num % 5 == 0) {
            System.out.println("Number you entered is divisible by 5");
        } else {
            System.out.println("Number you entered is not divisible by 5");
        }
        System.out.println("End Program.");
    }
}
