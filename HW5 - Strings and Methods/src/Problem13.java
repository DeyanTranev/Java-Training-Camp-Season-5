
public class Problem13 {

	static int[] joinArrays(int[] array1, int[] array2) {
		int[] joinedArray = new int[array1.length+array2.length];
		int index1 =0, index2 = 0;
		for (index1 = 0; index1 < array1.length; index1++) {
			joinedArray[index1] = array1[index1];
		}
		for (index2 = 0; index2 < array2.length; index2++) {
			joinedArray[index1+index2]=array2[index2];
		}
		return joinedArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		int[] combinedArr = joinArrays(arr1, arr2);
		for (int index = 0; index < combinedArr.length; index++) {
			System.out.print(combinedArr[index]+" ");
		}

	}

}
