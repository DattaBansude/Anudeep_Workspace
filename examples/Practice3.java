package com.examples;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str = sc.next().toLowerCase();
		System.out.println("Enter the char");
		
		boolean uppercase=str.charAt(0) > 65 && str.charAt(0) <=90;
		boolean lowercase=str.charAt(0) > 97 && str.charAt(0) <=122;
		
		boolean vowel = str.equals('a') ;
		
	}
}
