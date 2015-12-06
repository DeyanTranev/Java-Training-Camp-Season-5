import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		for (int index = 0; index < sentence.length; index++) {
			sentence[index] = sentence[index].replace(sentence[index].charAt(0), (char)(sentence[index].charAt(0)-32));
			System.out.print(sentence[index]+" ");
		}
		sc.close();
	}

}
