package com.java.trickyTriangles;

public class Homework {
    public static void main(String[] args) {
        Pattern1();
        Separator();
        Pattern2();
        Separator();
        Pattern3();
        Separator();
        Pattern4();
    }
    static void Separator() {
        System.out.println("====================================");
    }

    static void Pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void Pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void Pattern3() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void Pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}
