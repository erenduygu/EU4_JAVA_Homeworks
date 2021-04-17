package Assignment_8;

import java.util.Scanner;

public class Question6_NextThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int nums = scan.nextInt();

		next3(nums);

	}

	public static void next3(int num) {
		System.out.println((num + 1) + " " + (num + 2) + " " + (num + 3));
	}

}
