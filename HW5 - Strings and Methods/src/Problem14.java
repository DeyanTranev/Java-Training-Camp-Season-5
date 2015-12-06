import java.util.Scanner;

public class Problem14 {
	
	static double factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int initInt = sc.nextInt();
		double result = factorial(initInt);
		System.out.println(result);
		sc.close();
	}

}
