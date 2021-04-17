package Assignment_5_day11;

import java.util.Scanner;

public class Question6_FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an n number:");

		long n = scan.nextInt();

		long n1 = 0;
		long n2 = 1;

		System.out.println(n1);
		System.out.println(n2);

		for (int i = 1; i <= n - 2; i++) {

			long n3 = n1 + n2;

			System.out.println(n3);

			n1 = n2;
			n2 = n3;

		}
		System.out.println("Final number:" + n2);
	}

}
