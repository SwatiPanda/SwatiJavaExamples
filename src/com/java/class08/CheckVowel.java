package com.java.class08;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet to check if it is a vowel  ");

        char myChar = sc.next().toUpperCase().charAt(0);

        if (myChar == 'A' || myChar == 'E' || myChar == 'I' ||
            myChar == 'O' || myChar == 'U')
            System.out.println("This is a vowel");
        else
            System.out.println("This is not a vowel");
    }
}
