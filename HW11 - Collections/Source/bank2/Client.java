package bank2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client implements IClient {
	private String name;
	private String address;
	private double money;
	private double monthlySalary;
	private Bank bank;
	List<Deposit> deposits;
	List<Credit> credits;
	
	protected Client(String name, String address, double money, double monthlySalary) {
		this.name = name;
		this.address = address;
		this.money = money;
		this.monthlySalary = monthlySalary;
		this.deposits = new ArrayList<Deposit>();
		this.credits = new ArrayList<Credit>();
	}
	protected double getMoney() {
		return money;
	}
	protected void setBank(Bank bank) {
		if (bank != null) {
			this.bank = bank;
		}
	}
	@Override
	public void openDeposit(double amount) {
		if (this.money > 0 && amount <= this.money) {
			this.money -= amount;
			if (bank.acceptDeposit(this.name, amount) != null) {
				this.deposits.add(bank.acceptDeposit(this.name, amount));
			}
		}
		
	}
	protected double getMonthlySalary() {
		return monthlySalary;
	}
	protected Bank getBank() {
		return bank;
	}
	@Override
	public void applyForCredit(double amount, int months) {
		Credit newCredit = this.bank.approveCredit(this.name, amount, months, this.monthlySalary, Collections.unmodifiableList(this.credits));
		if (newCredit !=  null) {
			newCredit.setMonthlyPayment(bank.calculateMonthlyInterestPayment(newCredit));
			this.credits.add(newCredit);
			this.money+=amount;
		}
		
	}
	protected String getName() {
		return name;
	}
	protected String getAddress() {
		return address;
	}
	protected List<Deposit> getDeposits() {
		return Collections.unmodifiableList(deposits);
	}
	protected List<Credit> getCredits() {
		return Collections.unmodifiableList(credits);
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", money=" + money + ", monthlySalary=" + monthlySalary
				+ ", deposits=" + deposits + ", credits=" + credits.get(0) + "]";
	}
	@Override
	public void makeCreditPayment() {
		
		
	}
}
