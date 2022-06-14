package com.java.class27;

import java.util.Scanner;

public class StringFormatMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter favorite job");
        String job = sc.nextLine();
        System.out.println("enter favorite location");
        String location = sc.nextLine();
       String str = "You are a %s located at %s.";
       str = String.format(str, "SDET", "Delaware");
        System.out.println(str);


    }
}
