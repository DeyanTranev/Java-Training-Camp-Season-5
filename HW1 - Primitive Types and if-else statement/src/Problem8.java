import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 4-digit number:");
		int number = scan.nextInt();
		int firstNumber = (number/1000)*10 + (number%10);
		int secondNumber = ((number/100)%10)*10 + ((number/10)%10);
		//System.out.println(firstNumber);
		//System.out.println(secondNumber);
		if (firstNumber < secondNumber) {
			System.out.format("Po-malko (%d < %d)", firstNumber, secondNumber);
        }
		if (firstNumber == secondNumber) {
			System.out.format("Ravno: (%d = %d)", firstNumber, secondNumber);		
		}
		if (firstNumber > secondNumber) {
			System.out.format("Po-golqmo: (%d > %d)", firstNumber, secondNumber);
		}
			
		
		

	}

}
