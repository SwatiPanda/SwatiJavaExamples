package com.java.Homework;

import java.util.Scanner;

public class UsernamePasswd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input username and password: ");
        String username = sc.nextLine(), password = sc.nextLine();

        //Assuming username is "admin" and password is "PassWord"

        if (username.equals("admin")){
            if (password.equals("PassWord"))
                System.out.println("Login successful.");
            else {
                System.out.println("Password incorrect");
                System.out.println("Login Unsuccessful.");}
        }
        else{
            System.out.println("Username incorrect");
            System.out.println("Login Unsuccessful.");}
        }
    }

