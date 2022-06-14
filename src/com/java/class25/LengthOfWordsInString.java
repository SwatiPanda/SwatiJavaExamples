package com.java.class25;

public class LengthOfWordsInString {
    public static void main(String[] args) {
        String sentence ="The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling English language daily in the world.";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println("length of " + word + " is " + word.length());
        }
    }
}
