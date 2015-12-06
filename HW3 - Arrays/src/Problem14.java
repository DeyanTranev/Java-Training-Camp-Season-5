
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double[] a = {7.2,  5.6, 8.3, 9.0, 2.98, 2.0, 1.98, 1.99, 0, 7};
		double[] b = new double[a.length];
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			if ((a[i] >= -2.99) && (a[i] <= 2.99 )) {
				b[j] = a[i];
				j++;
			}
			
		}
		for (int i = 0; i < j; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
