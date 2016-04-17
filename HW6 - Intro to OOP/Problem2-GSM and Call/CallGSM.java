
public class CallGSM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM apple = new GSM();
		GSM lg = new GSM();
		apple.model = "iPhone 6";
		apple.insertSimCard("0898273485");

		
		lg.model = "Nexus 5X";
		lg.insertSimCard("0878932746");
	
		
		apple.call(lg, 2);
		apple.callHistory.outgoingCallsDuration = 12;
		lg.callHistory.outgoingCallsDuration = 15;
		
		double cost = apple.getSumForCalls();
	
		apple.printInfoForLastOutgoingCall();
		System.out.println();
		lg.printInfoForLastIncomingCall();
		System.out.format("The iphone has: %.2f lv to pay for his calls.", cost);
	}

}
