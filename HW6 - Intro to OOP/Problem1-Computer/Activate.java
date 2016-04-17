
public class Activate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer desktop = new Computer();
		desktop.year = 2013;
		desktop.price = 1500.75;
		desktop.hardDiskMemory = 2000;
		desktop.freeMemory = 7168;
		desktop.operatingSystem = "Windows 7";
		desktop.isNotebook = false;
		desktop.changeOperatingSystem("Windows 8.1");
		
		Computer laptop = new Computer();
		laptop.year = 2012;
		laptop.price = 800;
		laptop.hardDiskMemory = 256;
		laptop.freeMemory = 2560;
		laptop.operatingSystem =  "Windows 8.1";
		laptop.isNotebook =  true;
		laptop.useMemory(100);
		
		desktop.printComputerProperties();
		System.out.println();
		laptop.printComputerProperties();
		

	}

}
