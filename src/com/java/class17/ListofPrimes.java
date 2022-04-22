package com.java.class17;

import java.util.Scanner;

public class ListofPrimes {
    public static void main(String[] args) {
        System.out.println("Enter a number to print all primes under it: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 2;
        boolean isPrime = true;
        while(num1 <= num){
            for(int i = 2; i<num1; i++){
                if(num1%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num1);
            }
            isPrime = true;
            num1++;
        }


    }
}
