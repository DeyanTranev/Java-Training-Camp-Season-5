import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Kolko litra? :");
		int litres = scan.nextInt();
		int simultaneous = litres / 5;
		int extra2 = 0, extra3 = 0;
		int leftover = litres % 5;

		System.out.println(simultaneous+ " po 2 litra");
		System.out.println(simultaneous+" po 3 litra");
		
		if (leftover > 1 ) {
			if (leftover%3 == 0) 
			{
				extra3 = 1;
				extra2 = leftover - extra3;
				System.out.println("Dopylnitelno kofa ot 3 litra");
			}
			else
			{
				extra2 = leftover /2 + leftover % 2;
				System.out.println("Dopylnitelno "+extra2+" kofa/i ot 2 litra");
			}
		}


	}

}
