package Assignment_4;

import java.util.Scanner;

public class Question12_InternetServiceCharges {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your package letter: A,B or C");
		String letter = scan.next();

		double monthlyBill = 0;

		switch (letter) {

		case "A":
			System.out.println("Enter your hour of usage");
			Double hourOfUsage = scan.nextDouble();

			if (hourOfUsage > 10) {
				monthlyBill = 9.95 + (hourOfUsage - 10) * 2;
			} else
				monthlyBill = 9.95;
			break;
		case "B":
			System.out.println("Enter your hour of usage");
			hourOfUsage = scan.nextDouble();

			if (hourOfUsage > 20) {
				monthlyBill = 13.95 + (hourOfUsage - 20) * 1;
			} else
				monthlyBill = 13.95;
			break;
		case "C":
			monthlyBill = 19.95;
			break;

		}
		System.out.println("Total charge is : " + monthlyBill);

	}

}
