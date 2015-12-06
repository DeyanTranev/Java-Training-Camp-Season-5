
public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1 = 1, m2 =1;
		while (m1 < 10) {
			m2 = 1;
			while (m2<10) {
				if (m2>=m1) {
				System.out.format("%d*%d; ",m1,m2);
				
				}
				m2++;
			}
			m1++;
			System.out.println();
		}

	}

}
