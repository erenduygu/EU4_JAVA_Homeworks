package Lab_4;

import java.util.Arrays;

public class Question20_TwoafterTwo {

	public static void main(String[] args) {
		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 1, 2 };
		int[] z = { 2, 1, 2 };

		System.out.println(twoAfterTwo(x));
		System.out.println(twoAfterTwo(y));
		System.out.println(twoAfterTwo(z));

	}

	public static boolean twoAfterTwo(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 2 && arr[i + 1] == 2) {
				return true;
			}
		}
		return false;

	}

}
