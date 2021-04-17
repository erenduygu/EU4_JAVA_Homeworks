package Assignment_4;

import java.util.Scanner;

public class Question13_BankChecks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number of checks");
		int numberOfChecks = scan.nextInt();

		double parameter = 0;
		int base = 10;
		if (numberOfChecks < 20) {
			parameter = 0.1;

		} else if (numberOfChecks >= 20 && numberOfChecks < 40) {
			parameter = 0.08;

		} else if (numberOfChecks >= 40 && numberOfChecks < 60) {
			parameter = 0.06;

		} else if (numberOfChecks >= 60) {
			parameter = 0.04;

		}
		double fee = base + (parameter * numberOfChecks);

		System.out.println("Total Monthly Fee : " + fee + " $ ");

	}

}
