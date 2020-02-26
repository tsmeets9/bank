package bank;

public class BankClient {
	
	/**
	 * @invar This client is its account's owner
	 * 		|account == null || account.getOwner() == this
	 */
	private BankAccount account;
	
	public BankAccount getAccount() {
		return account;
	}
	
	public BankClient() {}
	
	/**
	 * @post This client's account equals the given account
	 * 			|getAccount() == account
	 * @post If the given account is effective, its owner equals this client
	 * 			| account == null || account.getOwner() == this
	 * @post The account's old owner's account equals null
	 * 			|account == null || account != old(getAccount())
	 * 			| || old(account == null ? null : account.getOwner()).getAccount() == null
	 * @param account
	 */
	
	public void setAccount(BankAccount account) {
		this.account = account;
		if (account != null)
			account.setOwner(this);
	}
}
