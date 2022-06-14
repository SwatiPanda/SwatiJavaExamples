package com.java.class24;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        int[][] myArray = {{3, 4, 6}, {7, 6, 4}, {9, 9, 2}};
        System.out.println("My input array: ");
        for (int[] row : myArray) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Sums of each row are: " + Arrays.toString(SumOfRow(myArray)));

        int[][] transposeArray = TransposeArray(myArray);
        System.out.println("Transpose of my array: ");
        for (int[] row : transposeArray) {
            System.out.println(Arrays.toString(row));
        }
    }
    //=====Declare Methods=====
    static int[] SumOfRow(int[][] myArray) {
        int[] sumOfRow = {0, 0, 0};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sumOfRow[i] += myArray[i][j];
            }
        }
        return sumOfRow;
    }
    static int[][] TransposeArray(int[][] myArray) {
        int[][] transposeArray = new int[3][3];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                transposeArray[j][i] = myArray[i][j];
            }
        }
        return transposeArray;
    }
}
