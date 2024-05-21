package com.modifiers;

//single Inheritance 
class Parent {
	void meth1() {
		System.out.println("meth1");
	}
}
class Child extends Parent {
	void meth2() {
		System.out.println("meth2");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.meth1();
		c.meth2();
	}
}
