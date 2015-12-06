
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{11,12,13,14,15,16}, {21,22,23,24,25,26}, {31,32,33,34,35,36},
				{41,42,43,44,45,46}, {51,52,53,54,55,56}, {61,62,63,64,65,66}};
		int row = 0; 
		int col = 0;
		int rowSum = 0;
		//int rowCount = 0;
		int sumTotal = 0;
		for (int i = 0; i < array.length*array.length; i++) {
			row = i/array.length;
			col = i % array[0].length;
			//System.out.println(row+","+col+";");


			if ((row+col)%2 == 0) {
				sumTotal+=array[row][col];
				rowSum+=array[row][col];
			}
			if (col == 5) {
				System.out.println("Sumata na red "+row+" e "+rowSum);
				rowSum=0;
			}

		}
		System.out.println(sumTotal);

	}
}
