package Bank;

import java.time.Period;
import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	private double balance;
	private double reserve;
	private ArrayList<DepositAccount> deposits;
	private ArrayList<CreditAccount> credits;
	
	static final int SHORT_TERM_DEPOSIT = 3;
	static final int LONG_TERM_DEPOSIT = 12;
	
	
	public void acceptDeposit (double amount, int months, DepositAccount newDeposit) {
		this.balance+=amount;
		this.reserve+=0.9*amount;
		this.deposits.add(newDeposit);
		
		
	}
	

	
	
	
}
