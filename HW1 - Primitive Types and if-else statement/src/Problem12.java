import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter day, month and year separated by a space: ");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (day == 31){
				day = 1;
				month++;
				System.out.println(day + " "+month+" "+ year);
			}
			else 
			{
				day++;
				System.out.println(day + " "+month+" "+ year);
			}

			break;
		case 2: 
			if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0))
			{
				if (day == 29) {
					month++;
					day = 1;
					System.out.println(day + " "+month+" "+ year);
				}
				else {
					day++;
					System.out.println(day + " "+month+" "+ year);
				}
				
				
			}
			else {
				if (day == 28) {
					day = 1;
					month++;
					System.out.println(day + " "+month+" "+ year);
				
				}
				else
				{
					day++;
					System.out.println(day + " "+month+" "+ year);
				}
			}
			break;
		case 12:
			if (day == 31) {
				day = 1;
				month = 1;
				year++;
				System.out.println(day + " "+month+" "+ year);
			}
			else
			{
				day++;
				System.out.println(day + " "+month+" "+ year);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day == 30) {
				day = 1;
				month++;
				System.out.println(day + " "+month+" "+ year);
				
			}
			else {
				day++;
				System.out.println(day + " "+month+" "+ year);
			}
			break;





		default:
			break;
		}

	}

}
