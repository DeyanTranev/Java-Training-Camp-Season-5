import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter array size: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Please enter the elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int repCounter = 1; 
		int index = 0; 
		int maxReps = 1; 
		int j = 0;
		for (index = 0; index < array.length-1; index++) {
			if (array[index] == array[index+1]) {
				j = index;
				while ((j <array.length-1) && (array[j] == array[j+1])) {
					repCounter++;
					j++;
					if (j == array.length-2 && array[size-2] == array[size-1]) {
						repCounter++;
					}
				}
				if (repCounter > maxReps) {
					maxReps = repCounter;
					
				}
				repCounter = 1;
				index = j+1;
			}
		}
		System.out.println(maxReps);

	}

}
