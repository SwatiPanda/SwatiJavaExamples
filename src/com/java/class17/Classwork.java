package com.java.class17;

public class Classwork {
    public static void main(String[] args) {
        //Prints all even numbers less than equal to 20
        isEven(20);
        //Prints all even numbers less than equal to 50
        isEven(50);
    }

    //Declare Method here
    static void isEven(int num) {
        System.out.println();
        System.out.println("Print all even numbers less than equal to " + num);
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
