package com.java.Homework;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine().toUpperCase();
        String rev = isPalin(word);
        if(word.equals(rev)){
            System.out.println("This is a palindrome.");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
    static String isPalin(String word){
        String rev = "";
        for(int i=word.length()-1; i>=0; i--){
            rev = rev + word.charAt(i);
        }
        return rev;
    }
}
