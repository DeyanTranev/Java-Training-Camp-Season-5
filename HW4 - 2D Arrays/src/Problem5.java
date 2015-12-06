
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int row = 0, col = 0;
		int rowSum = 0, maxRowSum = -2000000000;
		int colSum = 0, maxColSum = -2000000000;
		for (col = 0; col < arr[0].length; col++) {
			colSum=0;
			for (row = 0; row < arr.length; row++) {
				colSum+=arr[row][col];
			}
			if (colSum > maxColSum) {
				maxColSum = colSum;
			}
		}
		
		for (row = 0; row < arr.length; row++) {
			rowSum=0;
			for (col = 0; col < arr.length; col++) {
				rowSum+=arr[row][col];
			}
			if (rowSum > maxRowSum) {
				maxRowSum = rowSum;
			}
		}
		System.out.println("Nai-goliamata suma po redove e: " + maxRowSum);
		System.out.println("Nai-goliamats sumo po koloni e: " + maxColSum);
		if (maxRowSum > maxColSum) {
			System.out.println("Maksimalnata suma po redove e > ot maksimalnata suma po koloni.");
		}
		if (maxRowSum == maxColSum) {
			System.out.println("Maksimalnata suma po redove e = na maksimalnata suma po koloni.");
		}
		if (maxRowSum < maxColSum) {
			System.out.println("Maksimalnata suma po redove e < ot maksimalnata suma po koloni.");
		}
				
	}

}
