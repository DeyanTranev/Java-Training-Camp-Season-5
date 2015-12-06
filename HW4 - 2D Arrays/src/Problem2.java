import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int row =0, col = 0;
		for (row = 0; row < a.length; row++) {
			System.out.print(a[row][row]+ " ");
		}
		System.out.println();
		row = 0;
		for (col = a[0].length-1; col >= 0; col--) {
			System.out.print(a[row][col]+" ");
			row++;
		}

	}

}
