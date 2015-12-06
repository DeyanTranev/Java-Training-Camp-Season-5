import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		System.out.print(input[0].toUpperCase()+" ");
		System.out.print(input[0].toLowerCase()+" ");
		System.out.print(input[1].toUpperCase()+" ");
		System.out.println(input[1].toLowerCase());
		sc.close();
	}

}
