
public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public SavingsAccount(SavingsAccount originalAccount, double initilaBalance) {
		super(originalAccount.getOwner(), initilaBalance);
		savingsNumber = originalAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		deposit(getBalance() * rate/12);
		
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}
