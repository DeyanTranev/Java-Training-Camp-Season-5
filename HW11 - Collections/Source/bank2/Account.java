package bank2;

public abstract class Account {
	private String holderName;
	private double balance;
	private int annualInterest;
	private int months;
	private double monthlyPayment;


	protected Account(String holderName, double balance, int annualInterest, int months) {
		this.holderName = holderName;
		this.balance = balance;
		this.annualInterest = annualInterest;
		this.months = months;
		
	}

	protected void setAnnualInterest(int annualInterest) {
		this.annualInterest = annualInterest;
	}

	protected double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	protected String getHolder() {
		return holderName;
	}
	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", balance=" + balance + ", annualInterest=" + annualInterest
				+ ", months=" + months + ", monthlyPayment=" + monthlyPayment + "]";
	}

	protected int getAnnualInterest() {
		return annualInterest;
	}
	protected int getMonths() {
		return months;
	}
	protected double getMonthlyPayment() {
		return monthlyPayment;
	}

	protected void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
