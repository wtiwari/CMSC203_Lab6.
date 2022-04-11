
public class SavingsAccount extends BankAccount {
//fields 
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance) {
		//calling constructor and passing name and initial amounts to it 
		super(name, balance);
		//get the current value of account number 
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest () {
		double monthlyInterest =0;
		monthlyInterest = rate/12;
		super.deposit(monthlyInterest*super.getBalance());
		
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount (SavingsAccount savings1, double balance) {
		super(savings1, balance);
		++savingsNumber;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
