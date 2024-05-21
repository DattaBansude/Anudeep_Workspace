package com.modifiers;


class Shape {
     void getArea() {
	 System.out.println("shape");
 }
} 

class Rectangle extends Shape {
       double length=3.4 ;
       double width =3.6;
       double area = length *  width;
//      public Rectangle(double length, double width) {
//		// TODO Auto-generated constructor stub
//    	  this.length=length;
//    	  this.width=width;
//	}

	void  getArea() {
	 System.out.println("area: "+area);
     
 }
}


public class Practice3 {
	 public static void main(String[] args) {
		 Rectangle rectangle = new Rectangle();
		  rectangle.getArea();
//		 System.out.println("The area of the rectangle is: " + area);
//		 Shape s = new Shape();
//		 s.getArea();
		 }
}
