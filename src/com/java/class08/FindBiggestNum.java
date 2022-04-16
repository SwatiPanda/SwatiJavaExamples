package com.java.class08;

import java.util.Scanner;

public class FindBiggestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers to find the biggest: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b && a > c)
            System.out.println(a + " is the biggest number");
        else if (b > c)
            System.out.println(b + " is the biggest number");
        else if (a == b && b == c)
            System.out.println("All three are equal");
        else
            System.out.println(c + " is the biggest number");

        }
    }

