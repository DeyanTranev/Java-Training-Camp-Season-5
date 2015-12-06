import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int color1 = 0;
		int color2 = 0;
		if (x1 % 2 == 1) 
		{
			if (y1 % 2 == 0) {
				color1 = 0;
			}
			else {
				color1 = 1;
			}
		}
		else 
		{
			if (y1 % 2 == 0) {
				color1 = 1;
			}
			else color1 = 0;
		}
		
		if (x2 % 2 == 1) 
		{
			if (y2 % 2 == 0) {
				color2 = 0;
			}
			else {
				color2 = 1;
			}
		}
		else 
		{
			if (y2 % 2 == 0) {
				color2 = 1;
			}
			else color2 = 0;
		}
		if (color1 == color2) {
			System.out.println("Poziciite sa s ednakyv cviat.");
		}
		else {
			System.out.println("Poziciite sa s razlichen cviat.");
		}
		
	}

}
