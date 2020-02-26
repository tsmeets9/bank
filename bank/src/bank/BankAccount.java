package bank;
/**
 * @invar This account's owner is not null
 * 			|getOwner() != null
 * @invar This account is its owner's account
 * 			|getOwner().getAccount() == this
 */
public class BankAccount {

	/**
	 * @invar owner is not null
	 * 		|owner != null
	 * @invar owner's account equals this
	 * 		|owner.getAccount() == this  
	 * 
	 */
	private BankClient owner;
	
	public BankClient getOwner() {
		return owner;
	}
	
	/**
	 * The given client is not null
	 * 		|owner != null
	 * @post This account's owner equals the given owner
	 * 		|getOwner() == owner
	 */
	public BankAccount(BankClient owner) {
		this.owner = owner;
		owner.setAccount(this);
	}
	public void setOwner(BankClient newOwner) {
		if (newOwner != this.owner)
			this.owner.setAccount(null);
		this.owner = newOwner;
	}
}
