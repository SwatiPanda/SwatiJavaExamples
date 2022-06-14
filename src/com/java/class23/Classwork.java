package com.java.class23;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
        int listOfNum[] = {35, 33, 75, 43, 23, 67};
        int maxNum = 0;
        for (int num : listOfNum) {

            if (num > maxNum) {
                maxNum = num;
            }

        }
        System.out.println(maxNum);
    }
}
