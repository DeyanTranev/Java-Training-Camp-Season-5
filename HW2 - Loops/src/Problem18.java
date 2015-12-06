import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i <= m ; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.format("%d*%d=%d%n", i,j,i*j);
			}
		}

	}

}
