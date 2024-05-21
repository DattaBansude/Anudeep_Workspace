package com.calculator;

class Employee{
	
	int id;
	String name;
	String role;
	
	
	
public Employee() {
		super();
		
	}



public Employee(int id, String name, String role) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
}


public double calculateSalary()
{
	return 0.0;
	
}

class Manger extends Employee{
	
}
//	public Employee() {
//		// TODO Auto-generated constructor stub
//		
//	}
	
	
//	public Employee(int id, String name, String role){
//		
//		this.id = id;
//		this.name = name;
//		this.role = role;
//		
//		
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
//	public Employee(int id, String name, String role) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.role = role;
//	}

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	
}



public class EmpMain {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("datta");
		e.setRole("python");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getRole());
	}
}
