import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter array size: ");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		System.out.println("Please enter the array elements: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		int[] array2 = new int[size];
		array2[0] = array1[0];
		array2[size-1] = array1[size-1];
		for (int i = 1; i <= array2.length-2; i++) {
			array2[i]=array1[i-1]+array1[i+1];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}

	}

}
