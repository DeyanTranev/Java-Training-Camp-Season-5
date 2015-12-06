import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <=number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
