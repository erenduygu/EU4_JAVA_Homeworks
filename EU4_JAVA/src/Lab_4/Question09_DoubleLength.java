package Lab_4;

import java.util.Arrays;

public class Question09_DoubleLength {

	public static void main(String[] args) {
		int[] x = { 4, 5, 6 };

		System.out.println(Arrays.toString(doubleLength(x)));
	}

	public static int[] doubleLength(int[] arr) {
		int[] newArr = new int[2 * arr.length];
		newArr[newArr.length - 1] = arr[arr.length - 1];
		return newArr;

	}

}
