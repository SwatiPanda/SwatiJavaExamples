package com.java.personal;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String newStr = str.substring(1, str.length()-1);

        newStr = newStr.replace("x", "");
        str = str.charAt(0) + newStr + str.charAt(str.length()-1);

        System.out.println(str);
    }
}
