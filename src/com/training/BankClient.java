package oops;

public class BankClient {
	public static void main(String[] args) {
		Saving savingAccount = new Saving(1234, 
				                     "Anwar", 500, 4);
		System.out.println("Before deposit:"+saving.displayBalance());
		saving.deposit(300);
		System.withdraw(100);
		System.out.println("After withdraw:"+saving.displayBalance());
		savingAccount.addInterest();
		System.out.println("After adding interest:"+Saving.displayBalance());
		
		//dynamic polymorphism
		Account currentAccount = new Current(
									2781,"Hassan",400,100);
		currentAccount.deposit(500);
		currentAccount.withdraw(1050);
		System.out.println("After withdraw:"+current.displayBalance());
	}
}