package Lab_2;

import java.util.Scanner;

public class Question3_sumOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive number: ");

		int num = scan.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum = i + sum;
		}
		System.out.println(sum);
	}

}
