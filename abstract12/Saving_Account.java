package com.abstract12;

public class Saving_Account  extends Bank_Account{

	public Saving_Account(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amount);
		System.out.println("Deposite of amount "+ amount +" successful. current balance is : "+getBalance());
	}

	@Override
	public void withdraw(double amount) {
		
		if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of " + amount + " successful. Current balance: " + getBalance());
        } else {
            System.out.println("Insufficient Balance. Withdrawal failed.");
        }
	}

}
