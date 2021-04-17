package Lab_4;

import java.util.Arrays;

public class Question05_RotatedLeft {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 17, 12, 10, 8 };
		int[] a = { 7, 0, 0 };

		System.out.println(Arrays.toString(rotate(x)));
		System.out.println(Arrays.toString(rotate(y)));
		System.out.println(Arrays.toString(rotate(a)));

	}

	public static int[] rotate(int[] arr) {

		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		return arr;

	}

}
