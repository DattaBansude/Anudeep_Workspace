package com.abstract12;

abstract public class Bank_Account {

private	String accountNumber;
private	double balance;
	
	public Bank_Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	
	
	
	
}
