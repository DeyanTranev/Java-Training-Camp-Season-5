
public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {18,19,32,1,3, 4, 5, 6, 7, 8};
		int[] array2 = {1, 2, 3,4,5,16,17,18,27,11};
		int[] array3 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]>array2[i]) {
				array3[i] = array1[i];
			} 
			else {
				array3[i] = array2[i];
			}
			//System.out.print(array3[i]+" ");
		
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+" ");
		}

	}

}
