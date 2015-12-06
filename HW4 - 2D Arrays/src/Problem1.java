

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {48,72,13,14,15}, {21,22,53,24,75}, {31,57,33,34,35}, 
				{41,95,43,44,45}, {59,52,53,54,55}, {61,69,63,64,65} };
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("Nai-malko " + min);
		System.out.println("Nai-golqmo " + max);
	}
}


