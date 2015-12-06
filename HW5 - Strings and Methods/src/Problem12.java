import java.util.Scanner;

public class Problem12 {
	static int[] initArray (int arrlength) {
		int[] array = new int[arrlength];
		for (int index = 0; index < arrlength; index++) {
			array[index]=index+1;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] actualArray = initArray(number);
		for (int index = 0; index < number; index++) {
			System.out.print(actualArray[index]+" ");
		}
		sc.close();
	}
}
