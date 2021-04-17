package Assignment_4;

import java.util.Scanner;

public class Question4_TelephoneBill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter calling numbers:");
		int calls = scan.nextInt();

		double monthlyBill = 0;

		if (calls < 100) {
			monthlyBill = 200;
		} else if (calls >= 100 && calls < 150) {
			monthlyBill = 200 + (calls - 100) * 0.6;
		} else if (calls >= 150 && calls < 200) {
			monthlyBill = 230 + (calls - 150) * 0.5;
			;
		} else if (calls >= 200) {
			monthlyBill = 255 + (calls - 200) * 0.4;
			;
		}

		System.out.println(monthlyBill);

	}

}
