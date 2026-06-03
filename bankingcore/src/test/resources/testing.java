package bankingcore.miniproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import MiniProject.Customer;
import MiniProject.SavingAccount;

public class testing {

	    @Test
	    void testDeposit() {

	        Customer customer = new Customer("a101", "doremi", "female", 1234);

	        SavingAccount account = new SavingAccount(1001, 5000, customer, 0);

	        account.deposit(1000);

	        assertEquals(6000, account.getBalance());
	    }

		@Test
	    void testSavingsAccountWithdrawal() {

	        Customer customer =new Customer("a101", "doremi", "female", 1234);

	        SavingAccount account = new SavingAccount(1001, 5000, customer, 0);

	        account.withdraw(3000);

	        assertEquals(2000, account.getBalance());
	    }

	    @Test
	    void testInvalidWithdrawal() {

	    	Customer customer = new Customer= new Customer("a101", "doremi", "female", 1234);

	        SavingAccount account = new SavingAccount(1001, 5000, customer, 0);

	        assertThrows(
	            IllegalArgumentException.class,
	            () -> account.withdraw(4500)
	        );
	    }
	}
