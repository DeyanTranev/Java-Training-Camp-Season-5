import java.util.Calendar;
import java.util.TimeZone;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
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
	
	public Computer() {
		// TODO Auto-generated constructor stub
		this.isNotebook = false;
		this.operatingSystem = "Win XP";
		
	}
	
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	public Computer(int year, double price, double hardDiskMemory, int freeMemory) {
		this();
		if(year >= 1997 && year <=calendar.get(Calendar.YEAR)) {
			this.year = year;
		}
		else {
			this.year=1997;
			//Spored minimalnite hardware-ni iziskvaniq na Windows XP e nujen processor 233MHz. 
			//Za 1vi pyt e bil proizveden takyv model prez 97-ma.
		}
		if (price>0.0 && price <= 10000) {
			this.price = price;
		}
		if (hardDiskMemory >= 1.5) {
			this.hardDiskMemory = hardDiskMemory;
			//Otnovo spored minimalnite iziskvaniq na Win XP
		}
		if (freeMemory >= 0) {
			this.freeMemory = freeMemory;
		}
		
	}
	
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, 
			int freeMemory, String operatingSystem) {
		
		if(year >= 1997 && year <= calendar.get(Calendar.YEAR)) {
			this.year = year;
		}
		if (price > 0.0 && price <= 20000) {
			this.price = price;
		}
		if (hardDiskMemory >= 1.5) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory >= 0) {
			this.freeMemory = freeMemory;
		}
		if(operatingSystem != null && operatingSystem.length()>2) {
			this.operatingSystem = operatingSystem;
		} 
		else {
			this.operatingSystem = "Win XP";
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
	
	int comparePrice(Computer c) {
		int result=0;
		if(this.price > c.price) {
			result = -1;
			System.out.println("The current computer is more expensive than the one in parentheses");
		}
		if (this.price == c.price) {
			result = 0;
			System.out.println("The current computer is equal in price to the one in parentheses");
		}
		if (this.price < c.price) {
			result = 1;
			System.out.println("The current computer is cheaper than the one in parentheses");
		}
		return result;
		
	}
}
