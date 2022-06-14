package com.java.class24;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] data = {9, 2, 6, 4, 5, 3, 7, 1, 10};

        boolean foundNum;

        for (int j = 1; j <= 10; j++) {
            foundNum = false;

            for (int datum : data) {
                if (j == datum) {
                    foundNum = true;
                    break;
                }
            }
            if (!foundNum) {
                System.out.println(j + " is missing.");
            }
        }
    }
}

