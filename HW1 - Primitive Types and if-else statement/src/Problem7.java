import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What time is it? (hours only): ");
		int hourOfDay = scan.nextInt();
		System.out.println("How much money do I have? ");
		float money = scan.nextFloat();
		System.out.println("Am I healthy? true/false: ");
		boolean isHealthy = scan.nextBoolean();
		if (isHealthy) {
			if (money<10)
			{
				System.out.println("I will go to the cafe.");
			}
			if (money>=10)
			{
				System.out.println("I will go to the movies.");
			}
		
		}
		else
		{
			if (money>0) {
				System.out.println("I will buy medicine and stay home.");
			}
			else {
				System.out.println("I will stay home and have tea.");
			}
		}

	}

}
