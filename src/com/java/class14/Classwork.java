package com.java.class14;

public class Classwork {
    public static void main(String[] args) {
     String str1 = "Hello World";
     String str2 = "hello world";
     String str3 = "Hello World! Welcome to Devx";
        String str4 = "       ";
        String str5 = "";
     //check equality
        System.out.println(str1.equals(str2));
        //check equality ignore case
        System.out.println(str1.equalsIgnoreCase(str2));
        //check contains. be aware of order of string variables.
        System.out.println(str3.contains(str1));
        //change case.
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        //check contains. be aware of order of string variables.
        System.out.println(str3.contains(str1));
        System.out.println(str1.equalsIgnoreCase(str1));
        // charAt and find char and find index of the last occurence
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf("W"));
        System.out.println(str3.lastIndexOf("W"));
        // length of string
        System.out.println(str1.length());
        // length of string
        System.out.println(str1.length());
        // check for all spaces and empty string
        System.out.println(str4.isBlank());
        System.out.println(str5.isEmpty());
        // replace and replace all string
        System.out.println(str1.replace("Hello", "Hi"));
        System.out.println(str1.replace(str1, str3));
        // replace using format
        String str6 = "Welcome %s %s";
        System.out.println(String.format(str6, "Swati", "Piku"));
        //System.out.println(str1.replace(str1, str3));

    }
}
