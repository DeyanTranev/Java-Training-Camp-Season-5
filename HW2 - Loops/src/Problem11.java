import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if ((j>n-i) && (j<n+i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if ((j==n-i) || (j==n+i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
	}

}
