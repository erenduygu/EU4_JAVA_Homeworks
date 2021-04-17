package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task152_Methods_PlusMinus {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}
	}
}