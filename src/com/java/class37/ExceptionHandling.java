package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b;
        int[] myArr = {2, 8, 14};
        Scanner sc = new Scanner(System.in);
        try
        {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a/b);
            System.out.println(myArr[3]);
        }catch(InputMismatchException e)
        {
            System.out.println(e);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
