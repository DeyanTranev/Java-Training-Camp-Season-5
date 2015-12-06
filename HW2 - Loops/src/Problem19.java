import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prev = num; 
		int next = 0;
			
		do {
			if (prev % 2 == 1) {
				next = (3*prev)+1;
			}
			else {
				next = prev /2;
			}
			System.out.print(next + " ");
			prev = next;
		} while (next > 1);

	}

}
