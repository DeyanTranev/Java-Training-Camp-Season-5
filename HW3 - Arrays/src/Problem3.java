import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[10];
		arr[0]=arr[1]=num;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
