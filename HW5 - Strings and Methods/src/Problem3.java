import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(", ");
		int length1 = input[0].length();
		int length2 = input[1].length();
		int length = Math.min(length1, length2);
		int index = 0;
		if (length1 > length2) {
			System.out.println("The first string is longer.");
		}
		if (length1 == length2) {
			System.out.println("The two strings have equal lengths");
		}
		if (length1 < length2) {
			System.out.println("The second string is longer.");
		}
		for (index = 0; index < length; index++) {
			if (input[0].charAt(index) != input[1].charAt(index)) {
				System.out.println(index+1+" "+input[0].charAt(index)+"-"+input[1].charAt(index));
			}
		}
		sc.close();
	}

}
