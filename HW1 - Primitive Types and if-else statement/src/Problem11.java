import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Molia, vyvedete 3-cifreno chislo: ");
		int number = scan.nextInt();
		int digit1 = number % 10;
		int digit2 = (number/10)%10;
		int digit3 = (number/100)%10;
		//System.out.println(digit1+" "+digit2+" "+digit3);
		if ((number % digit1 == 0) && (number % digit2 == 0) && (number % digit3 == 0))
		{
			System.out.println("Chisloto se deli na vsichkite si cifri.");
		}
		else
		{
			System.out.println("Chisloto ne se deli na pone edna ot cifrite si.");
		}
		
		

	}

}
