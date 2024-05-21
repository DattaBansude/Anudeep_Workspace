package com.examples;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter no: ");
		int n =sc.nextInt();
		System.out.println("the number are: "+ n);
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
			sum =sum +i;
			
		}
		System.out.println("summesion is "+sum);
	}
}
