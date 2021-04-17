package Lab_4;

import java.util.Arrays;

public class Question14_CombineArrays_GoodInterviewQuestion {

	public static void main(String[] args) {

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };

		int[] a = { 4, 2 };
		int[] b = { 2, 2 };

		int[] i = { 9, 2 };
		int[] t = { 3, 4 };

		System.out.println(Arrays.toString(combineArrays(x, y)));
		System.out.println(Arrays.toString(combineArrays(a, b)));
		System.out.println(Arrays.toString(combineArrays(i, t)));

	}

	public static int[] combineArrays(int[] arr1, int[] arr2) {

		int[] newArray = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		
		int x=0;
		for (int i = arr1.length; i < newArray.length; i++) {
			newArray[i] = arr2[x];
			x++;
		}
		return newArray;

	}
}
