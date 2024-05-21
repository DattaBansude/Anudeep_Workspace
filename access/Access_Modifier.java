package com.access;

class A {
	A() {
		
	}
	int i=5;
	void meth()
	{
		System.out.println("meth1"+i);
		B b = new B();
		b.methNestead();
	}
	
	
	class B{
		void methNestead() {
			System.out.println("Meth Nestead ");
		}
	}
}

class C extends A{
	
	void meth3()
	{
		System.out.println(i);
		
	}
}

class D{
	
	A a = new A();
	void meth4() {
		System.out.println(a.i);
	}
}



public class Access_Modifier {

	  public static void main(String[] args) {
		
		  D d = new D();
		  d.meth4();
		  C c= new C();
		  System.out.println(c.i);
	}
	
}
