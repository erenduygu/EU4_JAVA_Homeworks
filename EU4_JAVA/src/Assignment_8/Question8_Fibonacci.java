package Assignment_8;

import java.util.Scanner;

public class Question8_Fibonacci {

	public static void main(String[] args) {
		fib();
	}

	public static void fib() {

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