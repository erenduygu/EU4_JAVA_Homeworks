package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task092_Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		long factorial = 1;

		for (int i = 1; i <= n; i++) {

			factorial = factorial * i;

		}
		System.out.println(factorial);
	}

}
