import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("A = ");
		float A = scan.nextFloat();
		System.out.println("B = ");
		float B = scan.nextFloat();
		System.out.println("C = ");
		float C= scan.nextFloat();
		
		if ((C>A) && (C<B) || (C>B) && (C<A))
		{
			System.out.println("The number " +C +" is between the numbers " +A + " and " +B +".");
		}
		else 
		{
			System.out.println("The number " +C + " is NOT between the numbers " +A+ " and " +B+".");
		}
		
	}

}
