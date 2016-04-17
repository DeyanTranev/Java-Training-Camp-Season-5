package bank2;

public class Demo {

	private static final int CREDIT_MONTHS = 59;
	private static final int CREDIT_BASE = 100000;
	private static final int DEPOSIT_SUPPLEMENT = 100000;
	private static final int DEPOSIT_BASE = 1000;
	private static final int BANK_CAPITAL = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new Bank("First Bank", "12 Java Street", BANK_CAPITAL);
		Client[] $clients = new Client[10];
		for (int clientIndex = 0; clientIndex < $clients.length; clientIndex++) {
			$clients[clientIndex]=new Client("Ivan"+clientIndex , clientIndex+" Eclipse str", DEPOSIT_BASE+Math.random()*DEPOSIT_SUPPLEMENT, 700+Math.random()*8000);
			$clients[clientIndex].setBank(bank1);
			
			
		}
		for (int clientIndex = 0; clientIndex < $clients.length; clientIndex++) {
			$clients[clientIndex].openDeposit(0.8*$clients[clientIndex].getMoney()+0.2*Math.random()*$clients[clientIndex].getMoney());
		}
		System.out.println("Bank cash after deposits: "+bank1.getAvailableCash());
		System.out.println("Bank reserve after deposits: "+bank1.getReserve());
		
		
		for (int index = 0; index < $clients.length; index++) {
			$clients[index].applyForCredit(Math.random()*CREDIT_BASE, (int)(Math.random()*CREDIT_MONTHS)+1);
		}
		
		System.out.println("Bank cash after credits: "+bank1.getAvailableCash());
		System.out.println("Bank reserve after credits: "+bank1.getReserve());
		
		for (int index = 0; index < $clients.length; index++) {
			System.out.println($clients[index]);
		}
	}

}
