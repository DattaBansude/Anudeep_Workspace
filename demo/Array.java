package com.demo;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		int [] b= Arrays.copyOf(a, a.length);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		a[2]= 90;
		System.out.println(b[2]);
	}
}
