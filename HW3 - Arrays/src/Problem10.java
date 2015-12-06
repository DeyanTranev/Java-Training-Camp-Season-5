import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] arr = new int[size];
		int sum = 0;
		float avg = 0;
		float minDiff = 2000000000;
		int minDiffIndex = 0;
		System.out.println("Enter the 7 array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		avg = (float)sum/size;
		System.out.println(avg);
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]-avg) < minDiff) {
				minDiff = Math.abs(arr[i]-avg);
				minDiffIndex = i;
			}
		}
		System.out.println(arr[minDiffIndex]);
	}

}
