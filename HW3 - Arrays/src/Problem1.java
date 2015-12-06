import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Please eneter the specified number of array elements:");
		
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		int min3 = Integer.MAX_VALUE;
		for (int i = 0; i < arraySize; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] < min3) {
					min3 = array[i];
				}
			}
		}
		System.out.println(min3);
	}

}
