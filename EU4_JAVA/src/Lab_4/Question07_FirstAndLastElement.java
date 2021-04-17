package Lab_4;

import java.util.Arrays;

public class Question07_FirstAndLastElement {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = {};

		int[] a = { 7, 4, 6, 2 };
		int[] b = {};

		System.out.println(Arrays.toString(firstLastElement(x, y)));
		System.out.println(Arrays.toString(firstLastElement(a, b)));
	}

	public static int[] firstLastElement(int[] arr1, int[] arr2) {

		arr2 = new int[2];
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length - 1];

		return arr2;

	}

}
