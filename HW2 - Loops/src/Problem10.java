import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int i  = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Chisloto e prosto.");
		}
		else {
			System.out.println("Chisloto ne e prosto.");
		}
	}

}
