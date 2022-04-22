package com.java.class17;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word:");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd word:");

        String str2 = sc.next();
        if(str1.length() >3 || str2.length() >3){
            System.out.println("One or more words have more than 3 chars.");
        }
        else {
            String mergedStrs = MergeStrings(str1, str2);
            System.out.println("merged word is: " + mergedStrs);
        }
    }
    static String MergeStrings(String str1, String str2) {
        String mergedStrs = "";
        for (int i = 0; (i < str1.length() && i < str2.length()); i++) {
            mergedStrs = mergedStrs +  str1.charAt(i) + str2.charAt(i);
        }
        return mergedStrs;

    }
}
