package com.java.class25;

public class FindFrequencyOfWords {
    public static void main(String[] args) {
        String str = "The Times of India is an English newspaper of India";
        String[] words = str.toUpperCase().split(" ");

        //======Removing duplicates and creating second array//

        String newStr = words[0];
        for (int i = 1; i < words.length; i++) {
            if (newStr.contains(words[i])) {
                break;
            } else {
                newStr += " " + words[i];
            }
        }
        String[] newWords = newStr.split(" ");

        //======Counting and printing frequency//
        System.out.println("    Word    Frequency ");
        for (int i = 0; i < newWords.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (newWords[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + "    " + count);
        }
    }
}
