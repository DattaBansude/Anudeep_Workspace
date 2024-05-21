package com.modifiers;

class ABCD {//outer class
	private int a = 5;
	void meth1() { 
		System.out.println("yes");
	}
	class D {//it is inner class or nested class
		
	}
}

//class PQR extends ABCD{
//	
//	void meth2() {
////		System.out.println(a);
//	}
//}



public class Private_Modifiers {

	public static void main(String[] args) {
		
		ABCD a = new ABCD();
		a.meth1();
	}
}
