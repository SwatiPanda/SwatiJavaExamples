package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWithFinally {
    public static void main(String[] args) {

        int[] myArr = {2, 8, 14};

        try {

            System.out.println(myArr[3]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("browser closes");
        }
    }
}
