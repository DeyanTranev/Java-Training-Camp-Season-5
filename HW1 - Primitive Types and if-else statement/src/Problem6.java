import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a1: ");
		int number1 = scan.nextInt();
		System.out.println("Enter a2: ");
		int number2 = scan.nextInt();
		System.out.println("Enter a1: ");
		int number3 = scan.nextInt();
		int buffer1 = number1;
		int buffer2 = number2;
		int buffer3 = number3;
    	number1 = buffer2;
		number2 = buffer3;
		number3 = buffer1;
		System.out.println("After exchange:");
		System.out.println("a1: " + number1);
		System.out.println("a2: " + number2);
		System.out.println("a3: " + number3);
			

	}

}
