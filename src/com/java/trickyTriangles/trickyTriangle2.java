package com.java.trickyTriangles;

public class trickyTriangle2 {
    public static void main(String[] args) {
        for(int i=5; i<=9; i++){
            for(int j=9; j>=i; j--){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
