
public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 3, 2, 4, 3, 7};
		boolean isJagged = true; 
		for (int i = 1; i < arr.length-1; i+=2) {
			if ((arr[i]<=arr[i-1]) && (arr[i])<=arr[i+1]) {
				isJagged = false;
				break;
			}
		}
		if (isJagged) {
			System.out.println("Nazyben nagore e.");
		} else {
			System.out.println("Ne e nazyben nagore");
		}

	}

}
