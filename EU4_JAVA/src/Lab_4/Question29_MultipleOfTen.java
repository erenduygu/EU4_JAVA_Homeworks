package Lab_4;

import java.util.Arrays;

public class Question29_MultipleOfTen {

	public static void main(String[] args) {
		
		int[] x = { 2, 10, 3, 4, 20, 5 };
		int[] y = { 10,1,1,20,25,26,24,100,3,6,5,9, };


		System.out.println(Arrays.toString(tenRun(x)));
		System.out.println(Arrays.toString(tenRun(y)));


	}

	public static int[] tenRun(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 10 == 0) {

				for (int j = i + 1; j < arr.length && arr[j] % 10 != 0; j++) {
					arr[j] = arr[i];
				}

			}

		}
		return arr;
	}

}
