package Lab_2;

import java.util.Scanner;

public class Question2_cookiesCalories {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cookies that you ate: ");
		int numberOfCookies = scan.nextInt();
		
		System.out.println("Total number of calories: "+ cookies(numberOfCookies));

	}

	public static int cookies(int numberOfCookies) {

		int calories = numberOfCookies * 75;
		return calories;
	}
}
