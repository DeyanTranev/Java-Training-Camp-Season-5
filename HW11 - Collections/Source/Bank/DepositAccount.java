package Bank;

public class DepositAccount extends Account {
	private static final int MONTHS_IN_A_YEAR = 12;
	private double monthlyInterest;

	protected DepositAccount(String holderName, int interest, int months, double balance) {
		super(holderName, interest, months, balance);
		this.monthlyInterest = interest/MONTHS_IN_A_YEAR;
	}
	
}
