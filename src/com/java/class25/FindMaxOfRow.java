package com.java.class25;

public class FindMaxOfRow {
    public static void main(String[] args) {
        int[][] data = {{100, 13, 3},{-24,-51,-36},{70,28,59}};
        int max = 0;

        for (int i = 0; i < data.length; i++) {
            max = data[i][0]; //essential point
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }

            System.out.println("Maximum From Row " + (i+1) + " is " + max);

        }
    }
}
