import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		double[] a = new double[size];
		double[] b = new double[3];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextDouble();
		}
		double max = 0;
		int maxIndex = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (Math.abs(a[j])>max) {
					max = Math.abs(a[j]);
					maxIndex = j;
				}
				
				
			}
			b[i] = max;
			a[maxIndex] = 0;
			max = 0;
			}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]+" ");
		}
		

	}

}
