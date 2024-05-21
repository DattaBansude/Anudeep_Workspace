package com.calculator;

import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
//	public void countVowels(String str) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			String str1 = str.toLowerCase();
//			char ch = str1.charAt(i);
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				coun++;
//			}
//		}
//	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}

