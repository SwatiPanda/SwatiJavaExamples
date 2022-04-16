package com.java.personal;

import java.util.Scanner;

public class CheckStringPrefix {
    public static void main(String[] args) {
        String str1 = " ";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //int n = sc.nextInt();
        //if(str.startsWith("not"))
            //System.out.println(str);
        //else
            //System.out.println("not"+str);
        //-------------------------------------
        //takes off nth character from a string
       // String str1 = str.substring(0, n-1) + str.substring(n);
        //System.out.println(str1);
        int n = str.length();
        char first = str.charAt(0);
        char last = str.charAt(n-1);
        //String new;
        System.out.println(str.substring(0,3));
        str1 = last + str.substring(1, n-1) + first;
        System.out.println(str1);
    }


    }

