package com.modifiers;

class Main{
	void meth() {
		System.out.println("meth1");
	}
}

class Subclass extends Main{
	void meth2() {
		System.out.println("meth2");
	}
}

class Demo extends Subclass{
	void meth3() {
		System.out.println("meth3");
	}
}


public class Multileval_Inheritance {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.meth();
		d.meth2();
		d.meth3();
	}
}
