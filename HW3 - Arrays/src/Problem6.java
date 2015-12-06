import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array 1:");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Please enter the elements of array 1:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Please enter the size of array 2:");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Please enter the elements of array 2:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		boolean elementsMatch = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] != arr2[i]) {
					elementsMatch = false;
					System.out.println("The arrays are not equal, but of same size.");
					break;
				}
			}
		}
		else {
			elementsMatch = false;
			System.out.println("The arrays are of a different size.");
		}
		if (elementsMatch) {
			System.out.println("The arrays are equal and of same size.");
		}
	}

}
