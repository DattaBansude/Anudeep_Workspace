package com.modifiers;

class Vehical{
	
	void drive() {
		System.out.println("Driving a car");
	}
}

class Car extends Vehical{
	
	void drive() {
		System.out.println("Repearing a Car");
	}
}



public class Practice2 {

	public static void main(String[] args) {
		
		 Vehical v = new Car();
		 Vehical c = new Vehical();
		 c.drive();
		v.drive();
		
	}
}
