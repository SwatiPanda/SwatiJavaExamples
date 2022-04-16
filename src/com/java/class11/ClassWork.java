package com.java.class11;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit:");
        int limit = sc.nextInt();
        // Code to list 'n' number of items from this series 10, 1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6......
        int i = 1, j = 0;
        while (i <= (limit + 1)/2) {
            System.out.print(11-i + " ");
            j++;
            if (j == limit)
                break;
            System.out.print(i + " ");
            j++;
            i++;
        }
    }
}
