package com.training;


public class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;
 
    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
 
    public String getAccountHolder() { return accountHolder; }
    public int getAccountNumber()    { return accountNumber; }
    public double getBalance()       { return balance; }
 
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
    }
 
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance.");
        balance -= amount;
    }
 
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
               " | Account Number: " + accountNumber +
               " | Balance: " + balance;
    }
}