public class SavingsAccount extends BankAccount {
    
	private double rate = 2.5; 
    private int savingsNumber = 0;
    private String accountNumber;

    
    public SavingsAccount(String name, double initial) {
        super(name, initial);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original, initialBalance); 
        this.savingsNumber = original.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public void postInterest() {
        double interest = (rate / 100.0 / 12) * getBalance();
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}

