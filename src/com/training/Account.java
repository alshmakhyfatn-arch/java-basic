public class Account {

	protected int accountNumber;
	protected String customerName;
	protected double balance; 
	
	public Account(int  accountNumber, String customerName, double balance) {
	private int accountNumber;
	private String customerName;
	protected double balance;

	public Account(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance= balance; 	
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposit:"+amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("withdraw:"+amount);
	} else {
		System.out.println("Insufficient balance");
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public double displayBalance() {
		return balance;
	}
}
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}	
}