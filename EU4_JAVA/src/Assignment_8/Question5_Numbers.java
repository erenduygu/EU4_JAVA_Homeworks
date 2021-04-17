package Assignment_8;

import java.util.Scanner;

public class Question5_Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = scan.nextInt();

		System.out.println(sign(x));

	}

	public static int sign(int num) {

		int nums = 0;
		if (num > 0)
			nums = 1;
		if (num == 0)
			nums = 0;
		if (num < 0)
			nums = -1;
		return nums;

	}

}
