import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = num;
		int sequential = 1;
		while (sequential <= 10) {
			if ((counter % 2 == 0)||(counter % 3 == 0)||(counter % 5 == 0)) {
				System.out.format("%d:%d; ",sequential,counter);
				sequential++;
			}
			counter++;
		}
		

	}

}
