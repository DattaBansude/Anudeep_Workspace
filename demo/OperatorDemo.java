package com.demo;

public class OperatorDemo {
//
//	int a = 30;
//	int b=  4;
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a , int b)
	{
		System.out.println(a*b);
	}
	public void div(int a , int b)
	{
		System.out.println(a/b);
	}
	public void mod(int a , int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		OperatorDemo op = new OperatorDemo();
		op.add(10,20);
		op.sub(6,3);
		op.mul(4,2);
		op.div(50,3);
		op.mod(20,5);	
	}
}
