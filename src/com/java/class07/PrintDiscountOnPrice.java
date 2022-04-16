package com.java.class07;

import java.util.Scanner;

public class PrintDiscountOnPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price ");
        double price1 = sc.nextDouble();
        if (price1 < 100){
            System.out.println("No discount");}
        else if(price1 <500){
                System.out.println("5% discount");}
        else if(price1 <1000) {
            System.out.println("10% discount");}
        else {
            System.out.println("15% discount");
            }
        }
    }

