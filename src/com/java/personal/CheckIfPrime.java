package com.java.personal;


import java.util.Scanner;


public class CheckIfPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 200 - 2000: ");
        int myNum = sc.nextInt();
        boolean isPrime = true;
        if (myNum >= 200 && myNum < 2000){

            for (int temp = 2; temp < myNum; temp++){
                //int remainder = myNum % temp;
                if (myNum % temp == 0) {
                    isPrime = false;
                    break;}
               }
               if (isPrime)
                System.out.println("This is a prime number.");
               else
                   System.out.println("This is not a prime number.");
        }
        else
            System.out.println("Number out of range");
       }
    }

