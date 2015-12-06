import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copyNum = num;
		int revNum = 0; int digit = 0;
		do {
			digit = copyNum % 10;
			revNum = revNum*10+digit;
			copyNum = copyNum / 10;
			
		} while(copyNum != 0);
		if (num == revNum){
		System.out.println("Chisloto e palindrom.");
		}
		else {
			System.out.println("Chisloto ne e palindrom.");
		}
			
	}

}
