package com.traning;

public class SavingsAccount extends Account {

	protected double interestRate;
	private double interestRate;

	public SavingsAccount(int accountNumber, String customerName,
			double balance, double interestRate) {

		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}
	
	public void aadInterst() {
		double interest = (balance * interestRate/100);
		balance += interest;
		System.out.println(interest+":Intereest add to the balance");

	public void addInterest() {
		balance = balance + interestRate;
	}
}