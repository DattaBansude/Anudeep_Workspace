package com.calculator;

class Operation{
	
	public void add(int a , int b)
	{
		int result = a+b;
		System.out.println(result);
	}
	
	public void add(int a , int b,int c )
	{
		int result = a+b+c;
		System.out.println(result);
	}

	public void add(int a , int b, float c)
	{
		float result = a+b+c;
		System.out.println(result);
	}

}

class Operation2{
	
	public void add(int a , int b)
	{
		int result = a+b;
		System.out.println(result);
	}
}



public class Cal {

	public static void main(String[] args) {
		Operation o = new Operation();
		o.add(3, 5);
		
		Operation2 op = new Operation2();
		
	}
}
