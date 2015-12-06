import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Molia, vyvedete temperaturata(po Celzii): ");
		int temperature =  scan.nextInt();
		if (temperature <= -20) {
			System.out.println("Ledeno studeno.");
			
		}
		if ((temperature > -20) && (temperature <= 0)) {
			System.out.println("Studeno.");
		}
		if ((temperature > 0) && (temperature<=15)) {
			System.out.println("Hladno");
		}
		if ((temperature>15) && (temperature <=25)) {
			System.out.println("Toplo.");
		}
		if (temperature > 25) {
			System.out.println("Goreshto.");
		}
		
	}

}
