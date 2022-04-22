package com.java.class17;

import java.util.Scanner;

public class ListPrimesMethod {
    public static void main(String[] args) {
        System.out.println("Enter a number to print all primes under it: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ListPrimes(num);
    }
    //Declare Method here
    static void ListPrimes(int num1){
        int num2 = 2;
        boolean isPrime = true;
        while(num2 <= num1){
            for(int i = 2; i<num2; i++){
                if(num2%i == 0){
                    isPrime = false;
                    break;}
            }
            if(isPrime){
                System.out.print(num2+", ");}
            isPrime = true;
            num2++;
        }
    }
}
