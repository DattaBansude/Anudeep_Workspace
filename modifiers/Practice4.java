package com.modifiers;


class Employee {
    int salary = 50000;

     void work() {
        System.out.println("working employee...");
    }

     void getSalary() {
        System.out.println("Employee salary : "+salary);
    }
}

class HRManager extends Employee {
     
     void work() {
        System.out.println("Hr Managing employees...");
    }

    public void addEmployee() {
        System.out.println("Adding employee...");
    }
}
public class Practice4 {

	
	public static void main(String[] args) {
        Employee e = new Employee();
        HRManager hr = new HRManager();

        e.work();
        e.getSalary();

        hr.work();
        hr.addEmployee();
    }
}



