package com.superkeyword;

/*
 * 
 */
class Grantparent{
	String name;
	
}
class Parent extends Grantparent{
//	super.name= "grantparent";
	String name;
	
}
public class Child extends Parent {

	String name;
	public void details() {
		
		super.name="parent";
		name="Child";
		System.out.println(super.name + " " +name);
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.details();
	}
}
