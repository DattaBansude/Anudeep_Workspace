package com.inheritance.practice;

//Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

class Employee {

	String name;
	String address;
	double salary;
	String job_title;

	public Employee(String name, String address, double salary, String job_title) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.job_title = job_title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public double calBonuse() {
		return 0.0;

	}

	public String performancreReport() {
		return "performance report";

	}

//	public String managingProject() {
//		return "managing project";
//           
//	}

}

class Manager extends Employee {
	
	int id ;

	public Manager(String name, String address, double salary, String job_title, int id) {
		super(name, address, salary, job_title);
		this.id = id;
		
		// TODO Auto-generated constructor stub
	}
     
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public int idNo() {
		return getId();
		
	}

	public double calBonuse() {
		return getSalary() * 0.20;

	}

	public String performancreReport() {
		return "performance report for manager " + getName();

	}

	public void manageProject() {
		System.out.println("manager manage project: " + getName());
	}

}

class Developer extends Employee {

	private String programong_languge;

	public Developer(String name, String address, double salary, String job_title, String programong_languge) {
		super(name, address, salary, job_title);
		this.programong_languge = programong_languge;
	}

	public String getProgramong_languge() {
		return programong_languge;
	}

	public void setProgramong_languge(String programong_languge) {
		this.programong_languge = programong_languge;
	}
	
	public String programingLanguage()
	{
		return getProgramong_languge();
		
	}
	public double calBonuse() {
		return getSalary() * 0.10;

	}

	public String performancreReport() {
		return "performance report for developer " + getName();

	}
	public void writeCode() {
		System.out.println("Developer "+getName()+" is writing a code in "+getProgramong_languge());
	}
	
}

class Programmer extends Developer {

	

	public Programmer(String name, String address, double salary, String job_title, String programong_languge) {
		super(name, address, salary, job_title, programong_languge);
		// TODO Auto-generated constructor stub
	}

	public double calBonuse() {
		return getSalary() * 0.05;

	}

	public String performancreReport() {
		return "performance report for programmer " + getName();

	}
	public void debugCode() {
		System.out.println("programmer "+getName()+ " is debugging a code  of "+getProgramong_languge());
	}
}

public class Exercise_10 {

	public static void main(String[] args) {
		
		Manager m = new Manager("datta", "pune", 45000, "java developer", 1);
		
		Developer d= new Developer("sagar", "mumbai", 40000, "tester", "python");
		
		Programmer p = new Programmer("vaibhav ", "Nagar", 70000, "cloud enginner", "java");
		//bonuses
		System.out.println("manager :"+m.calBonuse());
		System.out.println("developer : "+d.calBonuse());
		System.out.println("programmer : "+p.calBonuse());
		
//		performance report
		System.out.println("manager :"+m.performancreReport());
		System.out.println("developer :"+m.performancreReport());
		System.out.println("programmer :"+m.performancreReport());
		
//		odd methods
		m.manageProject();
		d.writeCode();
		p.debugCode();
		
		
	}
}
