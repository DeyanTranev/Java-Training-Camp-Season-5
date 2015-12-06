import java.util.Scanner;

public class Problem2FloatingPoints {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Number 1:");
	double firstNumber = scan.nextDouble();
	System.out.print("Number 2:");
	double secondNumber = scan.nextDouble();
	
	double sum = firstNumber + secondNumber;
	System.out.format("The sum of %.2f and %.2f is %.2f.", firstNumber, secondNumber, sum);
	double difference = firstNumber - secondNumber;
	System.out.format("The difference of %.2f and %.2f is %.2f.%n", firstNumber, secondNumber, difference); 
	
	double product = firstNumber * secondNumber;
	System.out.format("The product of %.2f and %.2f is %.2f.%n", firstNumber, secondNumber, product);
	double remainder = firstNumber % secondNumber;
	System.out.format("The remainder of %.2f divided by %.2f is %f.%n", firstNumber, secondNumber, remainder);
	double quotient = firstNumber / secondNumber;
	System.out.format("The quotient of %.2f divided by %.2f is %.4f.%n", firstNumber, secondNumber, quotient);
	
}
}
