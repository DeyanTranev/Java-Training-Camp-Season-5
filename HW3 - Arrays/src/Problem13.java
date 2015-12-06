import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "Molia, vyvedete chisloto: ";
		
		System.out.println(msg);
		int num = sc.nextInt();
		byte[] arr = new byte[32];
		int index = 0;
		
		while (num != 0) {
			arr[index++] = (byte)(num % 2);
			num = num /2;
		}
		for (int i = 0; i < index-1/2; i++) {
			System.out.print(arr[i]);
		}
	}

}
