package com.calculator;





public class Test4 {

	
	void display() {
		this.show();
		System.out.println("display method");
	}
	void show() {
		System.out.println("show method");
	}
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.display();
	}
}
