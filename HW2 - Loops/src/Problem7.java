import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = 3;
		for (int i = 0; i < n; i++) {
			System.out.print(output + ",");
			output+=3;
		}
	}

}
