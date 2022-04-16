package com.java.class07;

import java.util.Scanner;

public class LadderIfElseAssign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 - 9");
        int a = sc.nextInt();
        if (a < 0 || a > 9) {
            System.out.println("You entered invalid number.");
        }
        else if (a == 0) {
            System.out.println("You entered zero.");}
        else if (a == 1) {
            System.out.println("You entered one.");}
        else if (a == 2) {
            System.out.println("You entered two.");}
        else if (a == 3) {
            System.out.println("You entered three.");}
        else if (a == 4) {
            System.out.println("You entered four.");}
        else if (a == 5) {
            System.out.println("You entered five.");}
        else if (a == 6) {
            System.out.println("You entered six.");}
        else if (a == 7) {
            System.out.println("You entered seven.");}
        else if (a == 8) {
            System.out.println("You entered eight.");}
        else if (a == 9) {
            System.out.println("You entered nine.");}
        }
    }

