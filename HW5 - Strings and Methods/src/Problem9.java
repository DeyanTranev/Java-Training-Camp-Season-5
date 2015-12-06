import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String numString = sc.nextLine();
		String temp = "";
		int number = 0;
		int tempIndex =0;
		int sum = 0;
		for (int index = 0; index < numString.length(); index++) {
			if ((numString.charAt(index)>='0' && numString.charAt(index) <= '9') || 
			(numString.charAt(index) == '-')) {
				tempIndex = index;
				do {
					temp += numString.charAt(tempIndex);
					tempIndex++;
				} while (tempIndex < numString.length() && 
						(numString.charAt(tempIndex)>='0' && numString.charAt(tempIndex) <= '9'));
				index = tempIndex-1;
				number = Integer.parseInt(temp);
				sum+=number;
				temp="";
				System.out.println(number);
			}
		}
		System.out.println("Suma = "+sum);
		sc.close();
	}

}
