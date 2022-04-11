
public class CheckingAccount extends BankAccount {
	static final double FEE = .15;
	
	public CheckingAccount(String name, double initialAmount) {
		//calling constructor and passing name and initial amounts to it 
		super(name, initialAmount);
		//get the current value of account number 
		String accountNumber = getAccountNumber();
		//initialize accountNumber to be the current value in accountNumber concatenated with –10 
		setAccountNumber(accountNumber + "-10");
	}
	
	 /**
	 The Withdraw method overrides the withdraw method in the BankAccount class. 
	 This method should take the amount to withdraw, add to it the fee for check clearing, 
	 and call the withdraw method from the superclass
	 @param s The unadjusted score.
    */
	@Override
	public boolean withdraw(double amount) {
		
			super.withdraw(amount+FEE);
		
		return true;
		
	}

}
