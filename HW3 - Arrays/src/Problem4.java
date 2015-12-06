import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
	
		}
		boolean isMirrorred = true;
		for (int i = 0; i < array.length/2+1; i++) {
			if (array[i] != array[size-i-1]) {
				isMirrorred = false;
				break;
			}
		}
		if (isMirrorred) {
			System.out.println("Masivut e ogledalen.");
		}
		else {
			System.out.println("Masivut ne e ogledalen.");
		}

	}

}
