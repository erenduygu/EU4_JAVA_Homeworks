package Assignment_4;

import java.util.Scanner;

public class Question9_ShippingCharges {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the weight of package in pounds:");
		int weightOfPackages = scan.nextInt();
		double price = 0;

		if (weightOfPackages <= 2) {
			price = 1.10;
		} else if (weightOfPackages > 2 && weightOfPackages <= 6) {
			price = 2.20;
		} else if (weightOfPackages > 6 && weightOfPackages < 10) {
			price = 3.70;
		} else if (weightOfPackages > 10) {
			price = 3.8;
		}

		System.out.println("ShippingCharges : " + price + " $");

	}

}
