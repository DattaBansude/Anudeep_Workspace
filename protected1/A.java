package com.protected1;

public class A {

	protected int i;
 protected	void methA()
	{
		System.out.println("method of A");
	}
   protected	class B{
		void methB() {
			System.out.println("method of B");
		}
	}
}


class C extends A {
	void methC() {
		System.out.println(i);
		A a = new A();
		a.methA();
		A.B b = new A.B();
		b.methB();
	}
}

class M {
	void methM() {
		
		A a = new A();
		System.out.println(a.i);
		a.methA();
//		A.B b = new A.B();
//		b.methB();
	}
}