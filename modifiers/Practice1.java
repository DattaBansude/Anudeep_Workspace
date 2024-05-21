package com.modifiers;

class Animal{
	void makeSound() {
		System.out.println("animal sound...");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("mewoo....");
	}
}


public class Practice1 {

	public static void main(String[] args) {
		
		Animal a = new  Cat();
		a.makeSound();
		Animal a1= new Animal();
		a1.makeSound();
	}
}
