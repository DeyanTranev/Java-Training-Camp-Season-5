
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;
	void changeOperatingSystem(String newOperatingSystem) {
		this.operatingSystem = newOperatingSystem;
	}
	void useMemory (int memory) {
		if (this.freeMemory > memory) {
			this.freeMemory-=memory;
		}
		else {
			System.out.println("Not enough free memory!");
		}
	}
	void printComputerProperties() {
		System.out.println("The computer was manufactured in:"+ this.year);
		System.out.println("The computer costs: "+price+" USD");
		System.out.println("The computer is a notebok:"+isNotebook);
		System.out.println("The HDD capacity is: "+hardDiskMemory+" GB");
		System.out.println("The available memory after booting is: "+ freeMemory + "MB");
		System.out.println("The operating system installed is: "+operatingSystem);
		
	}
}
