package bank2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements IBank{
	private static final int PERCENT_CONVERSION_FACTOR = 100;
	private static final int MONTHS_CONVERSION_FACTOR = 12;
	private static final double SAFETY_LIMIT = 0.5;
	private static final int HOME_CREDIT_INTEREST = 6;
	private static final int CONSUMER_CREDIT_INTEREST = 10;
	private static final int LONG_DEPOSIT_MONTHS = 12;
	private static final int LONG_DEPOSIT_INTEREST = 5;
	private static final int SHORT_DEPOSIT_MONTHS = 3;
	private static final int SHORT_DEPOSIT_INTEREST = 3;
	
	private String name;
	private String address;
	 ArrayList<Deposit> deposits;
     ArrayList<Credit> credits;
	private double availableCash;
	private double reserve;
	
	protected Bank(String name, String address, double availableCash) {
		this.name = name;
		this.address = address;
		this.availableCash = availableCash;
		this.reserve = 0.1*availableCash;
		deposits = new ArrayList<Deposit>();
		credits = new ArrayList<Credit>();
	}

	@Override
	public Deposit acceptDeposit(String holderName, double amount) {
		Deposit newDeposit = null;
		if (amount < 5000) {
			 newDeposit = new Deposit(holderName, amount, SHORT_DEPOSIT_INTEREST, SHORT_DEPOSIT_MONTHS);
		}
		else { 
			newDeposit = new Deposit(holderName, amount, LONG_DEPOSIT_INTEREST, LONG_DEPOSIT_MONTHS);
		}
		newDeposit.setMonthlyPayment(this.calculateMonthlyInterestPayment(newDeposit));
		deposits.add(newDeposit);
		this.availableCash+=amount;
		reserve = 0.10*availableCash;
		return newDeposit;
		
	}
	
	@Override
	public Credit approveCredit(String holderName, double amount, int months, double monthlySalary, List<Credit> credits) {
		Credit newCredit = null;
		Credit test=null;
		if (amount < 50000) {
			test = new Credit(holderName, amount, CONSUMER_CREDIT_INTEREST, months);
		}
		else {
			test = new Credit(holderName, amount, HOME_CREDIT_INTEREST, months);
		}
		double applicantCreditPayments = calculateMonthlyInterestPayment(test);
		if (credits != null) {
			for (Credit applicantCredit : credits) {
				applicantCreditPayments += calculateMonthlyInterestPayment(applicantCredit);
			}
		}
		if (applicantCreditPayments <= SAFETY_LIMIT*monthlySalary && amount < 0.9*availableCash) {
			
			newCredit = test;
			this.credits.add(newCredit);
			newCredit.setMonthlyPayment(calculateMonthlyInterestPayment(newCredit));
			availableCash -= amount;
			reserve = 0.1*availableCash;
		}
		return newCredit;
	}
	
	@Override
	public void payDepositInterest() {
		// TODO Auto-generated method stub
		for (Deposit dep : deposits) {
			double mInt = calculateMonthlyInterestPayment(dep);
			dep.setBalance(dep.getBalance()+mInt);
			this.availableCash -= mInt;
		}
		
	}
	protected double getAvailableCash() {
		return availableCash;
	}

	protected double getReserve() {
		return reserve;
	}

	@Override
	public double calculateMonthlyInterestPayment(Account account) {
		// TODO Auto-generated method stub
		return account.getBalance()*((account.getAnnualInterest()/(double)MONTHS_CONVERSION_FACTOR*PERCENT_CONVERSION_FACTOR));
	}
	
	
	
}
