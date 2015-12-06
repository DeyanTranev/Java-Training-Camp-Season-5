import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < -0.231d) {
				a[i] = (i+1)*(i+1) + 41.25d;
			}
			else {
				a[i] = (i+1)*a[i];
			}
		}
		//NumberFormat formatter = new DecimalFormat("#0.00");  
		for (int i = 0; i < a.length; i++) {
			System.out.print((a[i])+" ");
		}
		sc.close();
	}

}
