package Lab_4;

import java.util.Arrays;

public class Question18_ExceptNumber13 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 2, 1 }; // = > 6
		int[] y = { 1, 1 }; // = > 2
		int[] a = { 1, 2, 2, 1, 13 }; // = > 6
		int[] b = { 1, 2, 2, 1, 13, 3 }; // = > 6

		unluckNumber(x);
		unluckNumber(y);
		unluckNumber(a);
		unluckNumber(b);

	}

	public static void unluckNumber(int[] arr) {

		int total = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 13) {
				total += arr[i];

			} else
				break;

		}

		System.out.println(total);
	}

}
