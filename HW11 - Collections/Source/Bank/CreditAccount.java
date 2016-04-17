package Bank;

public class CreditAccount extends Account {
	
	private double monthlyPayment;
	protected CreditAccount(String holderName, int interest, int months, double balance) {
		super(holderName, interest, months, balance);
		// TODO Auto-generated constructor stub
	}

	
	double calculateMonthlyPayment(double amount, int months) {
		this.monthlyPayment = (amount+(months/12)*super.getInterest())/months;
		return monthlyPayment;
	}
	
}
