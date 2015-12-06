import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a b c :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a >= b)
		{
			if (b>=c)
			{
				System.out.println(a +" " + b + " " + c);
			}
			if (c>a) 
			{
				System.out.println(c +" " + a + " " + b);
			}
			if ((a>c)&&(c>b))
			{
				System.out.println(a + " " + c + " " + b);
			}
    	}
		else 
		{
			if (a>=c)
			{
				System.out.println(b +" " + a + " " + c);
			}
			if (c>b)
			{
				System.out.println(c + " " + b + " " + a);
			}
			if ((b>c) && (c>a))
			{
				System.out.println(b + " " + c + " " + a);
			}
		}
		

	}

}
