import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(", ");
		int length1 = input[0].length();
		int length2 = input[1].length();
		int index = 0;
		int sumOfFirst = 0;
		int sumOfSecond = 0;
		for (index = 0; index < length1; index++) {
			sumOfFirst += input[0].charAt(index);
			//System.out.println(input[0].charAt(index)+" - "+(int)input[0].charAt(index));
		}
		for (index = 0; index < length2; index++) {
			sumOfSecond += input[1].charAt(index);
		}
		if (sumOfFirst >= sumOfSecond) {
			System.out.println(input[0]);
		}
		else {
			System.out.println(input[1]);
		}
		sc.close();
		

	}

}
