package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task134_InnerAndOuter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = 4;
		int sizeOuter = 7;
		int[] inner = { -1,0,3,12};
		int[] outer = { -1,0,3,3,3,10,12 };

		Arrays.sort(inner);
		Arrays.sort(outer);

		int num = 0;
		for (int each : inner) {

			for (int eachout : outer) {
				if (each == eachout) {
					num++;
					break;
				}
			}

		}
		if (num == inner.length) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}
}