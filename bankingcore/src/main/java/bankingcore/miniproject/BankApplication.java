package bankingcore.miniproject;

import java.io.IOException;
import java.util.Scanner;

public class BankApplication extends BankServices{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (true) {

            System.out.println("Choose a service by giving the respective number: ");
            System.out.println("1. Create Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Account Details");
            System.out.println("6. Generate Mini Statement");
            System.out.println("7. Save Accounts");
            System.out.println("8. Load Accounts");
            System.out.println("9. Generate High Balance Report");
            System.out.println("10. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.valueOf(sc.nextLine());

            switch (choice) {

                case 1:
                	createCustomer();
                    break;

                case 2:
                    createAccount();
                    break;

                case 3:
                	depositAcc();
                    break;

                case 4:
                	withdrawAcc();
                    break;

                case 5:
                	displayAccountDetails();
                    break;

                case 6:
                	generateMiniStatment();
                    break;

                case 7:
                    saveAccount();
                    break;

                case 8:
                	loadAccount();                	
                    break;
                case 9:
                    generateStatement();
                    break;

                case 10:
                    System.out.println("Thank you for using the Bank Application!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            	}
        	}
    	}
}
