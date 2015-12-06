
public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit1 =0, digit2 =0, digit3 = 0;
		for (int number = 100; number < 999; number++) {
			digit1 = number % 10;
			digit2 = (number/10)%10;
			digit3 = (number/100)%10;
			if ((digit1 != digit2) && (digit2 != digit3) && (digit1 != digit3)) {
				System.out.println(number);
			}
		}
	}

}
