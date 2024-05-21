package com.demo;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Enter num3: ");
		int num3=sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Num 1 is greater");
			}
		}
		else if(num2>num1) {
			if(num2>num3) {
				System.out.println("Num 2 is greater");
			}
		}
		else {
			System.out.println("Num3 is greater");
		}
		
	}

}
