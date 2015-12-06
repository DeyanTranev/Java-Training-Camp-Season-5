
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {48,72,13,14,15}, {21,22,53,24,75}, {31,57,33,34,35}, 
				{41,95,43,44,45}, {59,52,53,54,55}, {61,69,63,64,65} };
		int sum = 0; double avg = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
			}
		}
		avg = (double)sum/(array.length*array[0].length);
		System.out.println("The sum is: " +sum);
		System.out.println("The average is: "+ avg);
	}

}
