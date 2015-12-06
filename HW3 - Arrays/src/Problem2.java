import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int arraySize = sc.nextInt();
		int[] a = new int[arraySize];
		System.out.println("Please eneter the specified number of array elements:");
		
		for (int i = 0; i < arraySize; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[arraySize];
		for (int i = 0; i < arraySize/2; i++) {
			b[i] = a[i];
		}
		int j = 1;
		for (int i = arraySize/2; i < arraySize ; i++) {
			
			b[i]=a[arraySize-j];
			j++;
		}
		for (int i = 0; i < arraySize; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
