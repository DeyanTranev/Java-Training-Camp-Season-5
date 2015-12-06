
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{11,12,13,14,15,16}, {21,22,23,24,25,26}, {31,32,33,34,35,36},
				{41,42,43,44,45,46}, {51,52,53,54,55,56}, {61,62,63,64,65,66}};
		int rowSum = 0; int totalSum=0;
		for (int i = 1; i < array.length; i+=2) {
			rowSum = 0;
			for (int j = 0; j < array[i].length; j++) {
				rowSum+=array[i][j];
				System.out.print(array[i][j]+" ");
			}
			System.out.print("suma "+rowSum);
			System.out.println();
			totalSum+=rowSum;
		}
		System.out.println("Suma na elementite "+totalSum);
	}

}
