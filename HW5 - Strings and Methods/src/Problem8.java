import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String reverseText = "";
		for (int index = text.length()-1; index >= 0; index--) {
			reverseText += text.charAt(index);
		}
		if (text.equals(reverseText)) {
			System.out.println("da.");
		}
		else {
			System.out.println("ne.");
		}
		sc.close();
	}

}
