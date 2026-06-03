package junit.project.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest { 

	@Test
	void testDeposit() {

		Account acct = new Account(1000);

		acct.deposit(500);

		assertEquals(1600, acct.deposit(100));
	}

	@Test
	void testWithdraw() {

		Account acct = new Account(1000);

		acct.withdraw(300);

		assertEquals(700, acct.getBalance());
	}
}