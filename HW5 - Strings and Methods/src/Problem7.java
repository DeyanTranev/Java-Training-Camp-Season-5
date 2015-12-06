import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		int maxWordLength = 0;
		for (int index = 0; index < sentence.length; index++) {
			if (sentence[index].length() > maxWordLength) {
				maxWordLength = sentence[index].length();
			}
		}
		System.out.println(sentence.length + " words, the longest one is "+maxWordLength+" symbols long.");
		sc.close();
	}

}
