import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] arr = new int[size];
		System.out.println("Enter the 7 array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 5 && arr[i] % 5 == 0) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
