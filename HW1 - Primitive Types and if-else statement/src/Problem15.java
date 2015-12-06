import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int timeOfDay = scan.nextInt();
		if ((timeOfDay >= 4) && (timeOfDay <=9))
		{
			System.out.println("Dobro utro");
		}
		if ((timeOfDay >= 18)&&(timeOfDay <= 24))
		{
			System.out.println("Dobur vecher");
		}
		if ((timeOfDay >=0) && (timeOfDay <4))
		{
			System.out.println("Dobur vecher");
		}
		if ((timeOfDay > 9) && (timeOfDay <18))
		{
			System.out.println("Dobur den");
		}

	}

}
