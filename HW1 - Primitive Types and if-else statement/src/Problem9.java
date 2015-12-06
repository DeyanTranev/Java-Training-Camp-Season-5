import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the first 2-digit number: ");
		byte firstNumber = scan.nextByte();
		System.out.print("Please enter the second 2-digit number: ");
		byte secondNumber = scan.nextByte();
		int product = firstNumber*secondNumber;
		if ((product%10)%2 == 0) {
			System.out.format("%d, %d Even", product, product%10);
		}
		else {
			System.out.format("%d, %d Odd", product, product%10);
		}
			
		
	}

}
