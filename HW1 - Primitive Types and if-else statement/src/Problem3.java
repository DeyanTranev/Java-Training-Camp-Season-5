import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = scan.nextInt();
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("After exchange: ");
		System.out.println("First number: " + firstNumber);
		System.out.println("Second number: " + secondNumber);

	}

}
