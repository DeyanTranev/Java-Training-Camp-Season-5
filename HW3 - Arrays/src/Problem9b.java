import java.util.Scanner;

public class Problem9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of array elements: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		int[] array2 = new int[size];
		System.out.println("Please enter the array elelements: ");
		int index = 0;
		for (index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		for (index = 0; index < array2.length; index++) {
			array2[size-1-index] = array[index];
		}
		for (index = 0; index < array2.length; index++) {
			System.out.print(array2[index] + " ");
		}
	}

}
