import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete jelanata suma na cifri: ");
		int sumDigits = sc.nextInt();
		int digit1 =0, digit2 =0, digit3 = 0;
		for (int number = 100; number < 999; number++) {
			digit1 = number % 10;
			digit2 = (number/10)%10;
			digit3 = (number/100)%10;
			if (digit1+digit2+digit3 == sumDigits) {
				System.out.println(number);
			}
		}
	}

}
