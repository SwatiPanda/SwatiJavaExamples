package com.java.class27;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] data = {20, 12, 10, 60, 2, 40, 50, 70, 5};
        //int length = data.length -1;
        int hold = data[0];
        for (int i = 1; i< data.length; i++) {

            //if(hold > data[i]){
            //    hold = data[i];}

            hold = Math.min(data[i],hold );

        }
        System.out.println(hold);
    }
}
