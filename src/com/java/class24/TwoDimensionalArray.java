package com.java.class24;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        int[][] data = {{1,2,3},{5,4,2},{5,7,1},{4,2,1}};

        //==========number of rows=========
        System.out.println(data.length);

        //==========number of columns=======
       System.out.println(data[0].length);

        //=======Print all nums of 2D aaray========
        for(int[] num : data){
           for(int i: num){
               System.out.print(i + " ");
           }
            System.out.println();
        }
    }
}
