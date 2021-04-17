package Assignment_4;

import java.util.Scanner;

public class Question8_PackageWithDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number of package");
		int numberOfPackages = scan.nextInt();
		double totalamount = 0;
		double discount = 0;

		if (numberOfPackages < 10) {
			discount = 0;
		} else if (numberOfPackages >= 10 && numberOfPackages < 20) {
			discount = 0.2;
		} else if (numberOfPackages >= 20 && numberOfPackages < 50) {
			discount = 0.3;
		} else if (numberOfPackages >= 50 && numberOfPackages < 100) {
			discount = 0.4;
		} else if (numberOfPackages >= 100) {
			discount = 0.5;
		}

		totalamount = numberOfPackages * discount * 99;

		System.out.println("Amount of discount : " + discount);
		System.out.println("Amount of purchase : " + totalamount);

	}

}
