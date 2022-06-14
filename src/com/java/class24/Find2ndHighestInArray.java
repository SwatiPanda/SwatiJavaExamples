package com.java.class24;

public class Find2ndHighestInArray {
    public static void main(String[] args) {

        int[] data = {44,66,99,77,33,22,55};

        int max = data[0], secondMax = data[0];
        for(int i = 1; i< data.length; i++){
            if(data[i]>max){
                secondMax = max;
                max = data[i];
            } else if (data[i]>secondMax) {
                secondMax = data[i];

            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
