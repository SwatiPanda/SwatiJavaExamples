package com.java.class05;

import java.util.Scanner;

public class IfCondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an integer");
        int Num1 = sc.nextInt();
        System.out.println(" Enter another integer");
        //Scanner sc = new Scanner(System.in);
        int Num2 = sc.nextInt();
        if ( Num1 % 2 == 1 ){
            System.out.println("1st Number is Odd ");}
        else{
            System.out.println("1st Number is Even");}
        if ( Num2 % 2 == 1 ){
            System.out.println("2nd Number is Odd ");}
        else{
            System.out.println("2nd Number is Even");}
        System.out.println("End Program.");
    }
}
