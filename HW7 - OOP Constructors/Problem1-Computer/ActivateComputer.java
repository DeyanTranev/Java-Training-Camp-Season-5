
public class ActivateComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer desktop1 = new Computer(2011, 1100, 160, 8);
		Computer laptop1 = new Computer(2014, 1400, true, 256, 4, "Windows 7 Pro");
		
		desktop1.comparePrice(laptop1);

	}

}
