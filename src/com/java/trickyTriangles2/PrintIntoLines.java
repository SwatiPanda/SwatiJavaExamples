package com.java.trickyTriangles2;

public class PrintIntoLines {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;

        }
    }
}
