import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text1 = sc.nextLine();
		String text2 = sc.nextLine();
		//int length = Math.min(text1.length(), text2.length());
		//int index1 = 0;
		int index2 = 0;
		//int length1 = text1.length();
		int length2 = text2.length();
		for (index2 = 0; index2 < length2; index2++) {
			System.out.print(text2.charAt(index2));
			if (text1.charAt(0) == text2.charAt(index2)) {
				System.out.print(text1.substring(1));
			}
			System.out.println();
		}

		sc.close();
	}

}
