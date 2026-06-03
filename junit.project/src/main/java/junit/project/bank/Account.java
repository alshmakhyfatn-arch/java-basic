package junit.project.bank;

public class Account {

	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	// create withdraw method
	public double withdraw(double amount) {

		balance -= amount;

		return balance; 
	}
}