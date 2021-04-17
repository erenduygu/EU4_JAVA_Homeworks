package Lab_4;

import java.util.Arrays;

public class Question23_CreateArray {

	public static void main(String[] args) {

		int x = 9;
		System.out.println(Arrays.toString(fizzArray(x)));
	}

	public static int[] fizzArray(int num) {

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
	}

}
