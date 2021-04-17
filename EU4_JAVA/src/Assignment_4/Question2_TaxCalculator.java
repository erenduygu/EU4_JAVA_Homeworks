package Assignment_4;

import java.util.Scanner;

public class Question2_TaxCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your income:");
		int income = scan.nextInt();

		System.out.println("Your income:" + income);

		double taxAmount = 0;
		if (income <= 150_000_000) {
			taxAmount = income * 0.25;
		} else if (income <= 300_000_000) {
			taxAmount = (150_000_000 * 0.25) + ((income - 150_000_000) * 0.3);
		} else if (income <= 600_000_000) {
			taxAmount = 300_000_000 * 0.3 + (income - 300_000_000) * 0.35;
		} else if (income <= 1_200_000_000) {
			taxAmount = 600_000_000 * 0.35 + (income - 600_000_000) * 0.4;
		} else if (income > 1_200_000_000) {
			taxAmount = income * 0.50;
		}
		System.out.println("The tax amount you have to pay :" + taxAmount);
	}

}
