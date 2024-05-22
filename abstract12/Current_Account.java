package com.abstract12;

public class Current_Account extends Bank_Account {

	public Current_Account(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance() + amount);
        System.out.println("Deposit of  " + amount + " successful. Current balance:  " + getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		 if (getBalance() >= amount) {
	            setBalance(getBalance() - amount);
	            System.out.println("Withdrawal of " + amount + " successful. Current balance is: " + getBalance());
	        } else {
	            System.out.println("Insufficient Balance. Withdrawal failed.");
	        }
	}

}
