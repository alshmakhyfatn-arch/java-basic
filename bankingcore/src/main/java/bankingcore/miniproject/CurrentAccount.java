package bankingcore.miniproject;

import java.io.Serializable;

public class CurrentAccount extends Account implements Serializable {
	
	private static final long serialVersionUID = -569962895207828253L;
	private double overdraftLimit = 5000;
	

	public CurrentAccount(int accountNumber, double balance, Customer customer, double overdraftLimit) {
		super(accountNumber, balance, customer);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance+overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Amount withdrawn from current account");
		}
		else {
			System.out.println("Exceeds Overdraft");
		}
	}
	
	

}
