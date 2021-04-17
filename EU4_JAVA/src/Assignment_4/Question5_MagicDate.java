package Assignment_4;

import java.util.Scanner;

public class Question5_MagicDate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter month in numeric form:");
		int month = scan.nextInt();
		System.out.println("Enter day:");
		int day = scan.nextInt();
		System.out.println("Enter year in two digit:");
		int year = scan.nextInt();

		if (month * day == year) {
			System.out.println("the date is magic");
		} else {
			System.out.println("the date is not magic");

		}
	}

}
