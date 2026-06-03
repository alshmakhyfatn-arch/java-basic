package bankingcore.miniproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankServices {
	
	private static int idcounter =1000;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Customer> customers = new ArrayList<>();
	static ArrayList<Account> accounts = new ArrayList<>();
	static ArrayList<Transaction> transactions = new ArrayList<>();
	
	public static void createCustomer(){
		System.out.print("Customer ID: ");
		String custId = sc.nextLine();

		System.out.print("Customer Name: ");
		String custName = sc.nextLine();

		System.out.print("Gender: ");
		String gender = sc.nextLine();
		
		int mobile;
		while(true) {
			try {
			System.out.print("Mobile Number: ");
			mobile = Integer.valueOf(sc.nextLine());
			}
		    catch(Exception e) {
		    	System.out.println("the mobile number should be an integer");
		    	continue;
		    }
			break;
		}
		
		
		Customer c = new Customer(custId, custName, gender, mobile);
		customers.add(c);
		
		System.out.println("Customer created successfully.");
		
		//debugger
		System.out.println("Customers in list:");

		for(Customer c1 : customers) {
		    System.out.println("[" + c1.getCustomerId() + "]");
		}
	}

	
	
	public static void createAccount(){
		System.out.print("Enter Customer ID: ");
		String custId = sc.nextLine();

		Customer customerFound = null;
		

		for(Customer c : customers) {
		    if(c.getCustomerId().equals(custId)) {
		        customerFound = c;
		        break;
		    }
		}

		if(customerFound == null) {
		    System.out.println("Customer not found.");
		    return;
		   
		}	

		int type;
		while(true) {
			try {
				System.out.println("1. Saving Account");
				System.out.println("2. Current Account");
				type = Integer.valueOf(sc.nextLine());
			}
		    catch(Exception e) {
		    	System.out.println("Invalid input it should be an integer either 1 or 2");
		    	continue;
		    }
			break;
		}
		
		if(type == 1) {

		    
		    int accountNum ;
		    while(true) {
				try {
					System.out.print("Account ID: ");
					accountNum = Integer.valueOf(sc.nextLine());
				}
			    catch(Exception e) {
			    	System.out.println("Invalid input accountNum should be an integer");
			    	continue;
			    }
				break;
			}

		    
		    double balance;
		    while(true) {
				try {
				System.out.println("balance: " );
				balance = Double.valueOf(sc.nextLine());
				}
			    catch(Exception e) {
			    	System.out.println("the balance should be a decimal or integer");
			    	continue;
			    }
				break;
			}

		    double minBalance = 0;

		    SavingAccount acc =
		        new SavingAccount(
		            accountNum,
		            balance,
		            customerFound,
		            minBalance);

		    accounts.add(acc);
		}
		if(type == 2) {

			 int accountNum ;
			    while(true) {
					try {
						System.out.print("Account ID: ");
						accountNum = Integer.valueOf(sc.nextLine());
					}
				    catch(Exception e) {
				    	System.out.println("Invalid input accountNum should be an integer");
				    	continue;
				    }
					break;
				}

			 double balance;
			    while(true) {
					try {
					System.out.println("balance: " );
					balance = Double.valueOf(sc.nextLine());
					}
				    catch(Exception e) {
				    	System.out.println("the balance should be a decimal or integer");
				    	continue;
				    }
					break;
				}

		    double overdraft = 0;

		    CurrentAccount acc =
		        new CurrentAccount(
		        		 	accountNum,
				            balance,
				            customerFound,
				            overdraft);

		    accounts.add(acc);
		}
		
	}

	public static void depositAcc() {
		int accId;
		while(true) {
			try {
				System.out.print("Enter Account Number: ");
				accId = Integer.valueOf(sc.nextLine());
			}
		    catch(Exception e) {
		    	System.out.println("Invalid input Account Number should be an integer");
		    	continue;
		    }
			break;
		}

		Account accountFound = null;
		

		for(Account a : accounts) {
		    if( a.getAccountNumber() == accId) {
		    	accountFound = a;
		        break;
		    }
		}

		if(accountFound == null) {
		    System.out.println("Account not found.");
		    return;
		   
		}	
		 else {
		    
		    double amount;
			while(true) {
				try {
					System.out.print("Enter amount to deposit: ");
					amount = Double.valueOf(sc.nextLine());
				}
			    catch(Exception e) {
			    	System.out.println("Invalid input amount should be a decimal or integer");
			    	continue;
			    }
				break;
			}

		    accountFound.deposit(amount);
		    
		    Transaction t = new Transaction (idcounter , accId, "Deposite", amount);
		    transactions.add(t);
		    idcounter++;

		    System.out.println("Deposit successful.");
		}
		
	}
	
	
	public static void withdrawAcc() {
		
		int accId;
		while(true) {
			try {
				System.out.print("Enter Account Number: ");
				accId = Integer.valueOf(sc.nextLine());
			}
		    catch(Exception e) {
		    	System.out.println("Invalid input Account Number should be an integer");
		    	continue;
		    }
			break;
		}
		

		Account accountFound = null;
		

		for(Account a : accounts) {
		    if( a.getAccountNumber() == accId) {
		    	accountFound = a;
		        break;
		    }
		}

		if(accountFound == null) {
		    System.out.println("Account not found.");
		    return;
		   
		}	
		 else {
		
			 double amount;
				while(true) {
					try {
						System.out.print("Enter amount to withdraw: ");
						amount = Double.valueOf(sc.nextLine());
					}
				    catch(Exception e) {
				    	System.out.println("Invalid input amount should be a decimal or integer");
				    	continue;
				    }
					break;
				}

		    accountFound.withdraw(amount);
		    
		   Transaction t =  new Transaction (idcounter , accId, "Withdraw", amount);
		   transactions.add(t);
		    idcounter++;

		    System.out.println("Withdraw successful.");
		}
	}
		
		public static void displayAccountDetails() {
			int accId;
			while(true) {
				try {
					System.out.print("Enter Account Number: ");
					accId = Integer.valueOf(sc.nextLine());
				}
			    catch(Exception e) {
			    	System.out.println("Invalid input Account Number should be an integer");
			    	continue;
			    }
				break;
			}

			boolean found = false;

			for (Account acc : accounts) {

			    if (acc.getAccountNumber() == accId) {

			        found = true;

			        String accountType;

			        if (acc instanceof SavingAccount) {
			            accountType = "Saving Account";
			        } else if (acc instanceof CurrentAccount) {
			            accountType = "Current Account";
			        } else {
			            accountType = "Unknown";
			        }

			        System.out.println("Account Number : " + acc.accountNumber);
			        System.out.println("Customer Name  : " +
			                           acc.getCustomer().CustomerName);
			        System.out.println("Account Type   : " + accountType);
			        System.out.println("Balance        : " + acc.getBalance());
			        System.out.println("----------------------------");
			    }
			}

			if (!found) {
			    System.out.println("No accounts found for Account Number " + accId);
			}
		
	}
		
		public static void generateMiniStatment() {

			int accId;
			while(true) {
				try {
					System.out.print("Enter Account Number: ");
					accId = Integer.valueOf(sc.nextLine());
				}
			    catch(Exception e) {
			    	System.out.println("Invalid input Account Number should be an integer");
			    	continue;
			    }
				break;
			}

		    boolean found = false;

		    for (Account acc : accounts) {

		        if (acc.getAccountNumber() == accId) {

		            found = true;

		            for (Transaction t : transactions) {
		                if (t.getAccountNumber() == accId) {
		                    System.out.println(t);
		                    System.out.println("----------------------------");
		                }
		            }

		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("No account found for Account Number " + accId);
		    }
		}
		
		
		public static void saveAccount() throws IOException{
			try(
			BufferedWriter bwCustomer = new BufferedWriter
			(new FileWriter("customer.csv"));
			BufferedWriter bwAccount = new BufferedWriter
			(new FileWriter("account.csv"));
			BufferedWriter bwTransaction = new BufferedWriter
			(new FileWriter("transaction.csv"));
			)
			{
			bwCustomer.write("customerId, customerName, gender, mobileNumber");
			bwCustomer.newLine();
			for (Customer c : customers) {
			bwCustomer.write(
			c.getCustomerId() + "," +
			c.getCustomerName() + "," +
			c.getgender() + "," +
			c.getMobileNumber()
			);
			bwCustomer.newLine();
			}
			bwAccount.write("accountNumber, balance, customer, accountType");
			bwAccount.newLine();
			for (Account a : accounts) {

			String accountType;

			if (a instanceof SavingAccount) {
			accountType = "Savings";
			} else if (a instanceof CurrentAccount) {
			accountType = "Current";
			} else {
			accountType = "Unknown";
			}

			bwAccount.write(
			a.getAccountNumber() + "," +
			a.getBalance() + "," +
			a.getCustomer().getCustomerId() + "," +
			accountType
			);
			bwAccount.newLine();
			}
			bwTransaction.write("transactionId, accountNumber,transactionType, amount");
			bwTransaction.newLine();
			for (Transaction t : transactions) {
			bwTransaction.write(
			t.getTransactionId() + "," +
			t.getAccountNumber() + "," +
			t.getTransactionType() + "," +
			t.getAmount()
			);
			bwTransaction.newLine();
			}
			}
			catch(FileNotFoundException e) {
			System.out.println("File is not available or incorrect");
			e.printStackTrace();
			}

			}

		public static void loadAccount() throws IOException {

		    customers.clear();
		    accounts.clear();

		    Map<String, Customer> customerMap = new HashMap<>();

		    // Load Customers
		    try (BufferedReader brCustomer =
		             new BufferedReader(new FileReader("customer.csv"))) {

		        String line;
		        brCustomer.readLine(); // skip header

		        while ((line = brCustomer.readLine()) != null) {

		            String[] data = line.split(",");

		            String customerId = data[0];
		            String customerName = data[1];
		            String gender = data[2];
		            int mobileNumber = Integer.parseInt(data[3]);

		            Customer customer =
		                new Customer(
		                    customerId,
		                    customerName,
		                    gender,
		                    mobileNumber);

		            customers.add(customer);
		            customerMap.put(customerId, customer);
		        }
		    }

		    // Load Accounts
		    try (BufferedReader brAccount =
		             new BufferedReader(new FileReader("account.csv"))) {

		        String line;
		        brAccount.readLine(); // skip header

		        while ((line = brAccount.readLine()) != null) {

		            String[] data = line.split(",");

		            int accountNumber = Integer.parseInt(data[0]);
		            double balance = Double.parseDouble(data[1]);
		            String customerId = data[2];
		            String accountType = data[3];

		            Customer customer = customerMap.get(customerId);

		            if (customer == null) {
		                continue;
		            }

		            if (accountType.equalsIgnoreCase("Savings")) {

		                SavingAccount account =
		                    new SavingAccount(
		                        accountNumber,
		                        balance,
		                        customer,
		                        0);

		                accounts.add(account);

		            } else if (accountType.equalsIgnoreCase("Current")) {

		                CurrentAccount account =
		                    new CurrentAccount(
		                        accountNumber,
		                        balance,
		                        customer,
		                        0);

		                accounts.add(account);
		            }
		        }
		    }

		    System.out.println("Accounts loaded successfully.");

		    System.out.println("\n===== LOADED ACCOUNTS =====");

		    for (Account acc : accounts) {

		        String type;

		        if (acc instanceof SavingAccount) {
		            type = "Savings";
		        } else {
		            type = "Current";
		        }

		        System.out.println(
		            "Account Number : " + acc.getAccountNumber() +
		            "\nCustomer ID    : " + acc.getCustomer().getCustomerId() +
		            "\nCustomer Name  : " + acc.getCustomer().getCustomerName() +
		            "\nAccount Type   : " + type +
		            "\nBalance        : " + acc.getBalance() +
		            "\n----------------------------"
		        );
		    }
		}

		public static void generateStatement() throws IOException {

		    Map<String, String[]> customerMap = new HashMap<>();
		    Map<String, String[]> accountMap = new HashMap<>();

		    try (
		        BufferedReader brCustomer =
		            new BufferedReader(new FileReader("customer.csv"));

		        BufferedReader brAccount =
		            new BufferedReader(new FileReader("account.csv"));

		        BufferedReader brTransaction =
		            new BufferedReader(new FileReader("transaction.csv"));

		        BufferedWriter bwStatement =
		            new BufferedWriter(new FileWriter("statement.csv"))
		    ) {

		        // Load customers
		        brCustomer.readLine(); // skip header

		        String line;

		        while ((line = brCustomer.readLine()) != null) {
		            String[] data = line.split(",");
		            customerMap.put(data[0], data);
		        }

		        // Load accounts
		        brAccount.readLine(); // skip header

		        while ((line = brAccount.readLine()) != null) {
		            String[] data = line.split(",");
		            accountMap.put(data[0], data);
		        }

		        // Header
		        String header =
		            "customerId,customerName,accountNumber,accountType,balance,transactionId,transactionType,amount";

		        bwStatement.write(header);
		        bwStatement.newLine();

		        System.out.println("\n===== GENERATED STATEMENT =====");
		        System.out.println(header);

		        // Process transactions
		        brTransaction.readLine(); // skip header

		        while ((line = brTransaction.readLine()) != null) {

		            String[] t = line.split(",");

		            String transactionId = t[0];
		            String accountNumber = t[1];
		            String transactionType = t[2];
		            String amount = t[3];

		            String[] account = accountMap.get(accountNumber);

		            if (account == null) {
		                continue;
		            }

		            String balance = account[1];
		            String customerId = account[2];
		            String accountType = account[3];

		            String[] customer = customerMap.get(customerId);

		            if (customer == null) {
		                continue;
		            }

		            String customerName = customer[1];

		            String statementLine =
		                customerId + "," +
		                customerName + "," +
		                accountNumber + "," +
		                accountType + "," +
		                balance + "," +
		                transactionId + "," +
		                transactionType + "," +
		                amount;

		            // Write to file
		            bwStatement.write(statementLine);
		            bwStatement.newLine();

		            // Print to console
		            System.out.println(statementLine);
		        }
		    }

		    System.out.println("\nStatement generated successfully.");
		}
}
