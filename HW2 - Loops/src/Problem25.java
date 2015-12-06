import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte n = sc.nextByte();
		double fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
