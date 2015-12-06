import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Molia, vyvedete 3-cifreno chislo: ");
		int number = scan.nextInt();
		int flag = 0;
		int digit1 = number % 10;
		int digit2 = (number/10)%10;
		int digit3 = (number/100)%10;
		if ((digit1 == digit2) && (digit2 == digit3))
		{
			System.out.println("Cifrite sa ravni");
			flag = 1;
		}
		if ((digit1 < digit2) && (digit2 < digit3))
		{
			System.out.println("Nizhodiash red");
			flag = 1;
		}
		if ((digit1 > digit2) && (digit2 > digit3))
		{
			System.out.println("Vyzhodiasht red");
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Cifrite sa nenaredeni.");
		}
			

	}

}
