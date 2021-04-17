package repl_it_tasks.from150to200;

import java.util.Scanner;

public class Task152_Method_minus_Plus {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		plus_minus(arr);

	}

	public static void plus_minus(int[] myArray) {
		int countPositive = 0;
		int countNegative = 0;
		int countZeros = 0;

		for (int each : myArray) {

			if (each < 0) {
				countNegative++;
			} else if (each > 0) {
				countPositive++;
			} else if (each == 0) {
				countZeros++;
			}
		}
		System.out.println("positives:" + countPositive + ", negatives:" + countNegative + ", zeros:" + countZeros);
	}

}
