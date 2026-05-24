package com.traning;
public class Saving extends Account {

	private double interestRate;

	public SavingsAccount(int accountNumber, String customerName,
			double balance, double interestRate) {

		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		balance = balance + interestRate;
	}
}