
package Lab_2;

import java.util.Scanner;

public class Question5_taxTipBill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the charge of the meal: ");

		double chargeOfTheMeal = scan.nextDouble();

		double tax = chargeOfTheMeal * 6.75 / 100;
		double tip = (chargeOfTheMeal + tax) * 0.2;
		double total = chargeOfTheMeal + tax + tip;

		System.out.println("Meal charge: " + chargeOfTheMeal);
		System.out.println("tax amount: " + tax);
		System.out.println("tip amount: " + tip);
		System.out.println("total bill: " + total);

	}

}
