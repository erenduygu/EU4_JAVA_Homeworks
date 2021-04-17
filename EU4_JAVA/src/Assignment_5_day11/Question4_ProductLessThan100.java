package Assignment_5_day11;

import java.util.Scanner;

public class Question4_ProductLessThan100 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int product = 0;

		while (product < 100) {
			System.out.println("Enter a number: ");
			int num = scan.nextInt();
			product = num * 10;

			System.out.println(product);
		}
	}
}