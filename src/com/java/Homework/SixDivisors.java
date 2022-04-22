package com.java.Homework;

public class SixDivisors {
    public static void main(String[] args) {
        System.out.println("Numbers with more than 5 divisors are: ");
        for(int i = 1; i<=50; i++) {
            if (FindDivisors(i) > 5) {
                System.out.print(i + " ");
            }
        }
    }
    static int FindDivisors(int num){
        int count = 0;
        for(int i = 1; i<= num; i++){
            if(num%i == 0){
                count++;
            }
        }
        return count;
    }
}
