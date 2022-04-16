package com.java.Homework;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet to check if it is a vowel  ");
        char myChar = sc.next().toUpperCase().charAt(0);

       myChar = Character.toUpperCase(myChar);
        switch (myChar) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This is a vowel.");
            break;
            default:
                System.out.println("This is not a vowel");
        }
    }
}
