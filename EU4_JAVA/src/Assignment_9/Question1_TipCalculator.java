package Assignment_9;

import java.util.Scanner;

public class Question1_TipCalculator {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Split:");
		String isSplit = scan.next();
		scan.nextLine();
		System.out.println("Number of people:");
		int numberPeople = scan.nextInt();

		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();
		System.out.print("Service Quality:");
		String serviceQuality = scan.next();
		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);

	}

	public static void tipCalculator(String isSplit, int numberPeople, double checkAmount, String serviceQuality) {

		double totalToPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		double serviceQualityRate;

		switch (serviceQuality) {
		case "Poor":
			serviceQualityRate = 0.05;
			totalTip = (checkAmount * serviceQualityRate);
			break;
		case "Fair":
			serviceQualityRate = 0.1;
			totalTip = (checkAmount * serviceQualityRate);
			break;
		case "Good":
			serviceQualityRate = 0.15;
			totalTip = (checkAmount * serviceQualityRate);
			break;
		case "Great":
			serviceQualityRate = 0.2;
			totalTip = (checkAmount * serviceQualityRate);
			break;
		case "Excellent":
			serviceQualityRate = 0.25;
			totalTip = (checkAmount * serviceQualityRate);
			break;

		}

		tipPerPerson = totalTip / numberPeople;
		totalToPay = checkAmount + totalTip;
		totalPerPerson = totalToPay / numberPeople;

		System.out.print("\nNumber of people entered: ");
		for (int i = 1; i <= numberPeople; i++) {
			System.out.print("&");
		}
		System.out.println("\nService Quality: " + serviceQuality);
		System.out.println("\nTotal to pay: " + totalToPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

		scan.close();
	}
}
