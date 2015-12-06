import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String textIn = sc.nextLine();
		String textOut = "";
		for (int index = 0; index < textIn.length(); index++) {
			textOut += (char)(textIn.charAt(index)+5);
		}
		System.out.println(textOut);
		sc.close();
	}

}
