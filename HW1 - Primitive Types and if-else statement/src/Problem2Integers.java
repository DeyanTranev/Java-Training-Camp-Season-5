import java.util.Scanner;

public class Problem2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Number 1:");
		int firstNumber = scan.nextInt();
		System.out.print("Number 2:");
		int secondNumber = scan.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("The sum of " + firstNumber+" and "+ secondNumber + " is " + sum + ".");
		int difference = firstNumber - secondNumber;
		System.out.format("The difference of %d and %d is %d.%n", firstNumber, secondNumber, difference); 
		//Експериментирах с плейсхолдъри (ако така се наричат форматиращите символи като %d в Java). 
		//С +-четата в println става тегаво. За допълнителна информация чета от Oracle.com, 
		//обикновено е първия хит на Google по Java теми.
		int product = firstNumber * secondNumber;
		System.out.format("The product of %d and %d is %d.%n", firstNumber, secondNumber, product);
		int remainder = firstNumber % secondNumber;
		System.out.format("The remainder of %d divided by %d is %d.%n", firstNumber, secondNumber, remainder);
		int quotient = firstNumber / secondNumber;
		System.out.format("The quotient of %d divided by %d is %d.%n", firstNumber, secondNumber, quotient);
		
//		System.out.print("Number 1:");
//		double firstNumber = scan.nextDouble();
//		System.out.print("Number 2:");
//		double secondNumber = scan.nextDouble();
//		
//		double sum = firstNumber + secondNumber;
//		System.out.format("The sum of %.2f and %.2f is %.2f.", firstNumber, secondNumber, sum);
//		double difference = firstNumber - secondNumber;
//		System.out.format("The difference of %.2f and %.2f is %.2f.%n", firstNumber, secondNumber, difference); 
//		
//		double product = firstNumber * secondNumber;
//		System.out.format("The product of %.2f and %.2f is %.2f.%n", firstNumber, secondNumber, product);
//		double remainder = firstNumber % secondNumber;
//		System.out.format("The remainder of %.2f divided by %.2f is %f.%n", firstNumber, secondNumber, remainder);
//		double quotient = firstNumber / secondNumber;
//		System.out.format("The quotient of %.2f divided by %.2f is %.4f.%n", firstNumber, secondNumber, quotient);
//		

	}

}
