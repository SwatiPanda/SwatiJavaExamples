package com.java.class16;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your word: ");
        String str = sc.nextLine().toUpperCase();
        System.out.println("input the character to search: ");
        String myChar = sc.next().toUpperCase();
        int count = 0;
        for(int i = 0; i<= str.length()-1; i++){
            if (str.substring(i, i+1).equals(myChar)){
                count++;
            }
        }
        System.out.println(count);
    }
}
