import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i < b*b; i++) {
			if (i % 3 == 0) {
				System.out.print("skip 3,");
			}
			else {
				System.out.print(i+",");
				sum+=i;
			}
			if (sum>=200) {
				break;
			}
		}
	}

}
