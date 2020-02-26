package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void test() {
		BankClient client1 = new BankClient();
		BankClient client2 = new BankClient();
		BankAccount account1 = new BankAccount(client1);
		assert account1.getOwner() == client1;
		assert client1.getAccount() == account1;
		client2.setAccount(account1);
		assert client2.getAccount() == account1;
		assert account1.getOwner() == client2;
		assert client1.getAccount() == null;
		
		
		

		
	}

}
