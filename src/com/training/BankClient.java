package com.traning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1234, "Anwar", 500, 4);
		savingsAccount.displayBalance();
		savingsAccount.deposit(300);
		savingsAccount.displayBalance();
		savingsAccount.withdraw(100);
		

		Scanner sc = new Scanner(System.in);

		SavingsAccount[] savingsAccounts = new SavingsAccount[3];
		CurrentAccount[] currentAccounts = new CurrentAccount[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Enter Savings Account " + (i + 1));

			int accNo = readInt(sc, "Enter Account Number: ");
			String name = readString(sc, "Enter Customer Name: ");
			double balance = readDouble(sc, "Enter Balance: ");
			double interest = readDouble(sc, "Enter Interest Rate: ");

			savingsAccounts[i] =
					new SavingsAccount(accNo, name, balance, interest);
		}

		for (int i = 0; i < 3; i++) {

			System.out.println("Enter Current Account " + (i + 1));

			int accNo = readInt(sc, "Enter Account Number: ");
			String name = readString(sc, "Enter Customer Name: ");
			double balance = readDouble(sc, "Enter Balance: ");
			double overdraft = readDouble(sc, "Enter Overdraft Limit: ");

			currentAccounts[i] =
					new CurrentAccount(accNo, name, balance, overdraft);
		}

		System.out.println("Savings Accounts Balances:");
		for (SavingsAccount s : savingsAccounts) {
			System.out.println(s.displayBalance());
		}

		System.out.println("Current Accounts Balances:");
		for (CurrentAccount c : currentAccounts) {
			System.out.println(c.displayBalance());
		}

		sc.close();
	}

	public static int readInt(Scanner sc, String message) {
		while (true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.println("Invalid number. Try again.");
				sc.nextLine();
			}
		}
	}

	public static double readDouble(Scanner sc, String message) {
		while (true) {
			try {
				System.out.print(message);
				double value = sc.nextDouble();
				sc.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Enter number again.");
				sc.nextLine();
			}
		}
	}

	public static String readString(Scanner sc, String message) {
		System.out.print(message);
		return sc.nextLine();
	}
}