package Bank;
import java.time.Period;

public abstract class Account {
	private String holderName;
	private int interest;
	private int months;
	protected Account(String holderName, int interest, int months, double balance) {
		if (holderName != null) {
			this.holderName = holderName;
		}
		this.interest = interest;
		this.months = months;
		this.balance = balance;
	}
	private double balance;
	
	
	protected String getHolderName() {
		return holderName;
	}
	protected void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	protected int getInterest() {
		return interest;
	}
	protected int getMonths() {
		return months;
	}
	protected void setMonths(int months) {
		this.months = months;
	}
	protected double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	protected void setInterest(int interest) {
		this.interest = interest;
	}
	
	
}
