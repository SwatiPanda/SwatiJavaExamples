package com.java.Homework;

import java.util.Scanner;

public class MaxDigitOfNbr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = CountDigits(num);
        System.out.println("Number of digits in "+num+" is "+count);
        int[] digitsArray = FindDigits(count, num);
        System.out.println("Maximum digit in "+num+ " is "+ FindMaxDigit(count, digitsArray));
        int numReverse = ReverseNum(count, digitsArray);
        System.out.println("Reverse of "+num+" is "+numReverse);
        if(num == numReverse){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }

    static int CountDigits(int num) {
        int count = 0;
        if (num < 10) {
            count = 1;
            return count;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    static int[] FindDigits(int count, int num){
        int[] digitsArray = new int[count];
            for(int i=count-1; i>=0; i--) {
                digitsArray[i] = num%10;
                num = num/10;
            }
        return digitsArray;
    }
    static int FindMaxDigit(int count, int[] digitsArray){
        int maxDigit = 0;
        for(int i =0; i<=count-1; i++){
            if(digitsArray[i] > maxDigit){
                maxDigit = digitsArray[i];
            }
        }
        return maxDigit;
    }
    static int ReverseNum(int count, int[] digitsArray){
        int numReverse = 0;
        for(int i = count-1; i>=0; i--){
            numReverse = numReverse*10 + digitsArray[i];
        }
        return numReverse;
    }
}
