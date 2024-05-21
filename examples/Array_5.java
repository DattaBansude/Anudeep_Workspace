package com.examples;
//clone()
public class Array_5 {

	public static void main(String[] args) {
		int[] a = {12,21,0,5,7};
		int[] b=a.clone();
		//printing array elements of b
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
//		a[2]=11;
//		System.out.println(b[2]);
		System.arraycopy(a, 0, b, 0, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		a[3]=99;
		System.out.println(b[3]);
	}
}
