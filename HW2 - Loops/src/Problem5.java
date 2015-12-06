import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete purvoto chislo:");
		int number1 = sc.nextInt();
		System.out.println("Vuvedete vtoroto chislo:");
		int number2 = sc.nextInt();
		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
			
		}
		for (int i = number1; i <= number2 ; i++) {
			System.out.print(i+" ");
		}
	}
	
}
