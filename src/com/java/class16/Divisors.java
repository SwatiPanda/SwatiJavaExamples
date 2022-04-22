package com.java.class16;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        System.out.println("Enter any number to find its divisors: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Divisors of "+ num + " are: ");
        for(int i =1; i<= num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
