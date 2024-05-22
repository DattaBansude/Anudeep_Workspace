package com.abstract12;

public class BankMain {

	public static void main(String[] args) {
		Saving_Account s = new Saving_Account("132454",1000 );
		s.deposite(1000);
		s.withdraw(500);
		
		Current_Account c = new Current_Account("668093", 10000);
		c.deposite(5000);
		c.withdraw(2000);
	}
}
