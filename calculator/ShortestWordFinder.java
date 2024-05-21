package com.calculator;

import java.util.Scanner;

public class ShortestWordFinder {
    public static String findShortestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String shortestWord = words[0]; // Initialize shortestWord with the first word

        for (int i = 1; i < words.length; i++) {
            // Compare the length of each word with the length of shortestWord
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        return shortestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSentence = sc.nextLine();
        String shortest = findShortestWord(inputSentence);
        System.out.println("Shortest word: " + shortest);
    }
}
