package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task133_ConvertDecimaltToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		for (int i = 0; i < binary.length; i++) {
			double x = (Math.pow(2, binary.length - i - 1));
			if (decimal / x >= 1) {
				binary[i] = 1;
				decimal -= x;
			} else {
				binary[i] = 0;
			}

		}

		System.out.println(Arrays.toString(binary));

	}
}