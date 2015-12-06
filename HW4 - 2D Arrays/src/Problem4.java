
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int row = 0, col = 0;
		for (col = 0; col < arr[0].length; col++) {
			for (row = arr.length-1; row >= 0; row--) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}

}
