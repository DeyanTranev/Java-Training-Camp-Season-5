package instruments;

public class Client implements Runnable{
	private MusicShop ms;
	
	public void order(String name, int amount) {
		ms.sellInstrument(name, amount);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
