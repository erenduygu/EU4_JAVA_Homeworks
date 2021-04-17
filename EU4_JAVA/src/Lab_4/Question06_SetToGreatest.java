package Lab_4;

import java.util.Arrays;

public class Question06_SetToGreatest {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 11, 5, 9 };
		int[] a = { 110, 5, 98, 0, 1200, 11, -4 };

		System.out.println(Arrays.toString(greatest(x)));
		System.out.println(Arrays.toString(greatest(y)));
		System.out.println(Arrays.toString(greatest(a)));
	}

	public static int[] greatest(int[] arr) {

		int greatest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > greatest) {
				greatest = arr[i];

			}
		}
		for (int j = 0; j < arr.length; j++) {
			arr[j] = greatest;
		}

		return arr;
	}

}
