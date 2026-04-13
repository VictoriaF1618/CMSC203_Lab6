
public class CheckingAccount extends BankAccount {
		final static double FEE = 0.15;
		
		CheckingAccount(String name, double initialAmount){
			super(name, initialAmount);
			
		}
		
		@Override
		public boolean withdraw(double amount) {
			return super.withdraw(amount + FEE);
		}
}
