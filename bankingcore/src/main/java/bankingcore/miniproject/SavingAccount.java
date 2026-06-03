package bankingcore.miniproject;

import java.io.Serializable;

public class SavingAccount extends Account implements Serializable {
	
	private static final long serialVersionUID = -3651609505073557086L;
	private double minBalance= 1000;	

	
	public SavingAccount(int accountNumber, double balance, Customer customer, double minBalance) {
		super(accountNumber, balance, customer);
		this.minBalance = minBalance;
	}


	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}


	public double getMinBalance() {
		return minBalance;
	}



	@Override
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(minBalance < balance-amount) {
			balance -= amount;
			System.out.println(amount+" got withdrawn successfully in your account"); 
		}
		else { 
			
			throw new InsufficientBalanceException("Insufficient balance");	
			
			//System.out.println("Insufficient balance");
		}
		
	}
}
