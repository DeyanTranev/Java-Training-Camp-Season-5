
public class GSM {
	String model;
	CallHistory callHistory;
	SimCard simCard;
	
	void insertSimCard(String simMobileNumber) {
		if(simMobileNumber != null) {
			if(simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")) {
				this.simCard = new SimCard(simMobileNumber);
				
			}
		}
	}
	
	void removeSimCard() {
		this.simCard = null;
	}
	
	void call(GSM receiver, int duration) {
		if (receiver != null && receiver.simCard != null) {
			if(duration > 0 && duration <= 60) {
				if (this.simCard != null && 
						!this.simCard.simMobileNumber.equals(receiver.simCard.simMobileNumber)) {
					Call newCall = new Call();
					newCall.caller = this;
					newCall.receiver = receiver;
					newCall.duration = duration;
					
					this.callHistory = new CallHistory(duration, null, newCall);
					receiver.callHistory = new CallHistory(duration, newCall, null);
				}
			}
		}
	}
	
	double getSumForCalls() {
		if(this.callHistory.lastOutgoingCall == null) {
			return 0.0;
		}
		else {
			return this.callHistory.outgoingCallsDuration
					*this.callHistory.lastOutgoingCall.priceForAMinute;
		}
	}
	void printCallInfo(Call call) {
		if (call != null) {
			System.out.println("Telefon "+call.caller.simCard.simMobileNumber+" se obadi na "
		+call.receiver.simCard.simMobileNumber);
			System.out.println("Razgovoryt prodylji "+call.duration+" minuti");
		}
	}
	
	void printInfoForLastIncomingCall() {
		if (this.callHistory.lastIncomingCall != null) {
			this.printCallInfo(this.callHistory.lastIncomingCall);
		}
		else {
			System.out.println("Nqma obajdaniq kym tozi nomer.");
		}
	}
	
	void printInfoForLastOutgoingCall() {
		if(this.callHistory.lastOutgoingCall != null) {
			this.printCallInfo(this.callHistory.lastOutgoingCall);
		}
		else {
			System.out.println("Nqma obajdaniq ot tozi nomer.");
		}
	}
	
	
	

}
