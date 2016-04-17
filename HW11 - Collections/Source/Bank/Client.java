package Bank;

import java.time.Period;
import java.util.ArrayList;

public class Client {
	private String name;
	private String address;
	private double balance;
	private double monthlySalary;
	private Bank myBank;
	
	private ArrayList<DepositAccount> deposits;
	private ArrayList<CreditAccount> credits;
	
	void openDeposit(double amount, int months) {
		if (this.balance > 0 && amount < this.balance) {
			this.balance -= amount;
			DepositAccount newDeposit = new DepositAccount(this.name, 3, months, amount);
			this.deposits.add(newDeposit);
			myBank.acceptDeposit(amount, months, newDeposit);
		}
	}
	

	
}
