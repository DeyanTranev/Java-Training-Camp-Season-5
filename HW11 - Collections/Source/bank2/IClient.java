package bank2;

import java.util.List;

public interface IClient {
	void openDeposit(double amount);
	void applyForCredit(double amount, int months);
	void makeCreditPayment();
}
