import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		char squareInterior = sc.next().charAt(0);
		for (int i = 0; i < number ; i++) {
			if ((i==0) || (i == number-1)) {
				for (int j = 0; j < number; j++) {
					System.out.print("*");
				}
			}
			else {
			for (int j = 0; j < number; j++) {
				if ((j != 0) && (j != number-1 )) {
					System.out.print(squareInterior);
				}
				else {
					System.out.print("*");
				}
				
			}
			}
			System.out.println();
		}

	}

}
