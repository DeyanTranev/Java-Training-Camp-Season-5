import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		byte suit = 0;
		int cardnum = 0;
		for (int i = num; i <= 52; i++) {
			suit = (byte)(i % 4);
			cardnum = (i / 4) +2;
			if (cardnum<=10) {
				System.out.print(cardnum + " ");
			}
			if (cardnum == 11) {
				System.out.print("Vale ");
			}
			if (cardnum == 12) {
				System.out.print("Dama ");
			}
			if (cardnum == 13) {
				System.out.print("Pop ");
			}
			if (cardnum >=14) {
				System.out.print("Aso ");
			}
			if (suit == 0) {
				System.out.print("spatia, ");
			}
			if (suit == 1) {
				System.out.print("karo, ");
			}
			if (suit == 2) {
				System.out.print("kupa, ");
			}
			if (suit == 3) {
				System.out.print("pika, ");
			}
		}

	}

}
