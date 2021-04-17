package Assignment_8;

import java.util.Scanner;

public class Question1_CreateMethod {

	public static void main(String[] args) {

		plus();
	}

	public static void plus() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = scan.nextInt();

		System.out.println("Enter the second number");
		int num2 = scan.nextInt();

		int total = num1 + num2;

		System.out.println("Total= " + total);
	}

}
