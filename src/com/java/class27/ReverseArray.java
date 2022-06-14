package com.java.class27;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] data = {20, 12, 10, 60, 40, 50, 70};
        int length = data.length -1;

        for (int i = 0; i<= length/2; i++) {
            int hold = data[i];
            data[i] = data[length-i];
            data[length-i] = hold;
        }
        System.out.println(Arrays.toString(data));
    }
}
