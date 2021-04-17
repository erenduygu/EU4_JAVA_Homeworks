package Lab_4;

import java.util.Arrays;

public class Question25_DiffersBy2OrLess {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		int[] y = { 2, 3, 10 };
		
		int[] a = {1,2,3};
		int[] b = {2,3,5};
	
	
		System.out.println(countDiffer(x, y));
		System.out.println(countDiffer(a, b));

	}

	public static int countDiffer(int[] x, int[] y) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (y[i] == x[i] + 1 || y[i] == x[i] + 2) {
				count++;
			}
		}
		return count;
	}
}
