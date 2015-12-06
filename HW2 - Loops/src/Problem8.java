import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int digit = size-1;
		int number = 0;
	    for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				number = 10*number+digit;
			}
			System.out.println(number);
			digit += 2;
			number = 0;
		}
		
	

	}
}
