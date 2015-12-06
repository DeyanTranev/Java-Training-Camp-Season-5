import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		String Output1 = input[1].substring(0, 5)+input[0].substring(5, input[0].length());
		String Output2 = input[0].substring(0, 5)+input[1].substring(5, input[1].length());
		System.out.print(Math.max(input[0].length(), input[1].length())+" ");
		if (input[0].length() >= input[1].length()) {
			System.out.println(Output1);
		} 
		else {
			System.out.println(Output2);
		}
		sc.close();
	}
}
