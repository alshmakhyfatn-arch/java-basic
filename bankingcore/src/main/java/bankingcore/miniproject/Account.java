package bankingcore.miniproject;

import java.io.Serializable;

//import InsufficientBalanceException;

public abstract class Account {
	
	protected int accountNumber;
	
	protected double balance;
	
	protected Customer customer;
	

	public Account(int accountNumber, double balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	//deposit
	public void deposit(double amount) {
		balance += amount; //balance = balance+amount
		System.out.println(amount+" got deposited successfully in your account"); 
	}
	
	//withdraw
//	public void withdraw(double amount) {
//		if(amount < balance) {
//			balance -= amount;
//			System.out.println(amount+" got withdrawn successfully in your account"); 
//		}
//		else {
//			System.out.println("Insufficient balance");
//		}
//		
//	}
	
	public abstract void withdraw(double amount) throws InsufficientBalanceException;
	
	public double displayBalance() {
		return balance;
	}

}

//Abstract method: No implementation
//Concrete method: having implementation

//Interface: 100% abstract - explore interface
