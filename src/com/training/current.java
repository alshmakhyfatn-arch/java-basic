package com.traning;

public class Current extends Account {

	private double overdraftLimit;

	public CurrentAccount(int accountNumber, String customerName,
			double balance, double overdraftLimit) {

		super(accountNumber, customerName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {

		if (amount <= balance + getOverdraftLimit()) {
			balance = balance - amount;
		} else {
			System.out.println("Overdraft limit exceeded");
		}
	}
}