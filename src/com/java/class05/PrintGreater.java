package com.java.class05;

import java.util.Scanner;

public class PrintGreater {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter an integer");
            int Num1 = sc.nextInt();
            System.out.println(" Enter another integer");
            int Num2 = sc.nextInt();
            if ( Num1 > Num2 ){
                System.out.println("Greater is "+Num1);}
            else if (Num1 == Num2) {
                    System.out.println("Both are equal.");}
                else {
                    System.out.println("Greater is " + Num2);}
            System.out.println("End Program.");
        }
    }

