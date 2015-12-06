import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = scan.nextInt();
		if (firstNumber < secondNumber)
		{
			System.out.format("Lower value: %d%n", firstNumber);
			System.out.format("Higher value: %d%n.", secondNumber);
		}
		else {
			System.out.format("Lower value: %d%n", secondNumber);
			System.out.format("Higher value: %d%n.", firstNumber);
			
		}

	}

}
