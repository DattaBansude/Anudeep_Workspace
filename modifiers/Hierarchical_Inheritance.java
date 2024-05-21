package com.modifiers;

class AB{
	void meht1()
	{
		System.out.println("meht1");
	}
}
class PQ extends AB{
	void meth2() {
		System.out.println("meth2");
	}
}

class XY extends AB{
	void meth3() {
		System.out.println("meth3");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		PQ p = new PQ();
		p.meht1();
		p.meth2();
		
		XY x = new XY();
		x.meht1();
		x.meth3();
		
	}
}
