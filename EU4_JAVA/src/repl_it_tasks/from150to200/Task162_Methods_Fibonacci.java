package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task162_Methods_Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);

	}

	public static void fib(int num) {

		int pre1 = 0;
		int pre2 = 1;
		int sum=0;
		for (int i = 2; i <= num; i++) {

			sum = pre1 + pre2;
			pre1 = pre2;
			pre2 = sum;

		

		}System.out.println(sum);
	}

}
