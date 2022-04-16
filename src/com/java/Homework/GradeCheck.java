package com.java.Homework;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        switch (grade){
            case "A":
                System.out.println("90 - 100");
                break;
            case "B":
                System.out.println("80 - 89");
                break;
            case "C":
                System.out.println("70 - 79");
                break;
            case "D":
                System.out.println("60 - 69");
                break;
            case "F":
                System.out.println("0 - 59");
                break;
            default:
                System.out.println("You have failed");
                break;
        }

    }
}
