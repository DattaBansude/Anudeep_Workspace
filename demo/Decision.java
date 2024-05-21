package com.demo;

import java.util.Scanner;

public class Decision {
//	Write a Java program to get a number from the user and print whether it is positive or negative.
//	Write a Java program that takes three numbers from the user and prints the greatest number.
	public static void main(String[] args) {
		
		//int x =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int x = sc.nextInt();
		if (x>0) {
			System.out.println("Number is positive "+x);
		}
		else if (x==0) {
			System.out.println("Number is Neutral "+x);
		}
		else {
			System.out.println("Number is Negative "+x);
		}
	}
}
