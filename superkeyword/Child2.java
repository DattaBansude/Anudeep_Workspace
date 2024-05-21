package com.superkeyword;

class Parent2{
	String name;
	
	public Parent2(String na)
	{
		name = na;
	}
	
}
public class Child2 extends Parent2
{
	String name;
	public Child2(String n1,String n2) {
		super(n1);
		// TODO Auto-generated constructor stub
		name= n2;
		
		
	}
	public void details() {
		System.out.println(super.name + " "+ name);
	}


	

	public static void main(String[] args) {
		
		Child2 chh = new Child2("Parent", "child");
		
		
		chh.details();
		
	}
}
