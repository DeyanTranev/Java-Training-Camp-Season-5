import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Molia, vuvedete m i n, otdeleni s interval: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		if (m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		for (int i = n; i > m; i--) {
			if (i % 50 == 0) {
				System.out.print(i +",");
			}
		}
	}

}
