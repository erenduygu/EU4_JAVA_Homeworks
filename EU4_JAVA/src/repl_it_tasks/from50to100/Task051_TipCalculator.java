package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task051_TipCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double totalToPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		System.out.println("Split:");
		String split = scan.next();
		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();

		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();
		System.out.print("Service Quality:");
		String serviceQuality = scan.next();

		double serviceQualityRate;

		if (serviceQuality.equals("Poor")) {
			serviceQualityRate = 0.05;
			totalTip = (checkAmount * serviceQualityRate);
		}

		else if (serviceQuality.equals("Fair")) {
			serviceQualityRate = 0.1;
			totalTip = (checkAmount * serviceQualityRate);
		}

		else if (serviceQuality.equals("Good")) {
			serviceQualityRate = 0.15;
			totalTip = (checkAmount * serviceQualityRate);
		}

		else if (serviceQuality.equals("Great")) {
			serviceQualityRate = 0.2;
			totalTip = (checkAmount * serviceQualityRate);
		}

		else if (serviceQuality.equals("Excellent")) {
			serviceQualityRate = 0.25;
			totalTip = (checkAmount * serviceQualityRate);
		}

		tipPerPerson = totalTip / numberOfPeople;
		totalToPay = checkAmount + totalTip;
		totalPerPerson = totalToPay / numberOfPeople;

		System.out.print("\nNumber of people entered: ");
		for (int i = 1; i <= numberOfPeople; i++) {
			System.out.print("&");
		}
		System.out.println("\nTotal to pay: " + totalToPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}
}
