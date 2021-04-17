package Lab_2;

import java.util.Scanner;

public class Question1_largestSmallestNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first number: ");
		int firstNumber = scan.nextInt();

		System.out.println("Enter your second number: ");
		int secondNumber = scan.nextInt();

		System.out.println("Do you want to add another number: 0-No, 1-Yes");
		int selection = scan.nextInt();

		if (selection == 0) {
			if (firstNumber < secondNumber) {
				System.out.println("Smallest number is: " + firstNumber);
				System.out.println("Largest number is: " + secondNumber);

			} else {
				System.out.println("Smallest number is: " + secondNumber);
				System.out.println("Largest number is: " + firstNumber);

			}
		} else if (selection == 1) {

			for (int i = 1; i <= 10000; i++) {

				System.out.println("Enter your another number: ");
				int anotherNumber = scan.nextInt();

				System.out.println("Do you want to add another number: 0-No, 1-Yes");
				selection = scan.nextInt();

				if (selection == 1) {
					continue;
				} else if (selection == 0) {

					if (anotherNumber > firstNumber && anotherNumber > secondNumber && firstNumber > secondNumber) {
						System.out.println("Smallest number is: " + secondNumber);
						System.out.println("Largest number is: " + anotherNumber);
					} else if (anotherNumber > firstNumber && anotherNumber > secondNumber
							&& firstNumber < secondNumber) {
						System.out.println("Smallest number is: " + firstNumber);
						System.out.println("Largest number is: " + anotherNumber);
						break;
					} 
						
					
				}
			}
		}

	}

}
