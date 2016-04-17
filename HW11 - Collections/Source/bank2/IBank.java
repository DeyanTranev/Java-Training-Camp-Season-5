package bank2;

import java.util.List;

public interface IBank {
	Deposit acceptDeposit(String holderName, double amount);
	public Credit approveCredit(String holderName, double amount, int months, double monthlySalary, List<Credit> credits);
	void payDepositInterest();
	double calculateMonthlyInterestPayment(Account account);
	
	
	
}
