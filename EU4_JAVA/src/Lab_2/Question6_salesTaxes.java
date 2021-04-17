package Lab_2;

import java.util.Scanner;

public class Question6_salesTaxes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the amount of a purchase: ");

		double amountOfPurchase = scan.nextDouble();

		double stateTax = amountOfPurchase * 0.04;
		double countyTax = amountOfPurchase * 0.02;
		double totalTax = stateTax + countyTax;
		double total = amountOfPurchase + totalTax;

		System.out.println("Amount of the purchase: " + amountOfPurchase);
		System.out.println("state tax amount: " + stateTax);
		System.out.println("county tax amount: " + countyTax);
		System.out.println("total tax: " + totalTax);
		System.out.println("=============================");
		System.out.println("total of the sale: " + total);

	}

}
