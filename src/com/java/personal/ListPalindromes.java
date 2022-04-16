package com.java.personal;

public class ListPalindromes {
    public static void main(String[] args) {
        int num1 = 10;
        String s1, s1Reverse;
        System.out.println("List of palindromes between 10 to 200: ");
        while (num1 < 200){
            s1 = String.valueOf(num1);
            s1Reverse = new StringBuilder(s1).reverse().toString();
            if(s1.equals(s1Reverse))
                System.out.print(num1 + "\t");
            num1++;
        }
    }
}
