import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int ctr = 0;
		do {
			ctr++;
			sum+=ctr;
			
			
		} while(ctr<n);
			System.out.println(sum);

	}

}
