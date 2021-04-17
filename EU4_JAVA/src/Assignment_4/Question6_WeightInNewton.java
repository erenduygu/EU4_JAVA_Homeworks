package Assignment_4;

import java.util.Scanner;

public class Question6_WeightInNewton {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter mass of object:");
		int mass = scan.nextInt();

		double weight = mass * 9.8;

		if (weight > 1000) {
			System.out.println("that is too heavy");
		} else if (weight < 1000) {
			System.out.println("that is too light");
		}

	}

}
