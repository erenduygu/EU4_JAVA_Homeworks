package Lab_4;

public class Question12_FirstOne {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 3 };

		int[] a = { 7, 2, 3 };
		int[] b = { 1 };

		int[] i = { 3, 2, 4 };
		int[] t = { 4, 3, 4 };
		
		System.out.println(firstOne(x, y));
		System.out.println(firstOne(a, b));
		System.out.println(firstOne(i, t));

	}

	public static int firstOne(int[] arr1, int[] arr2) {
		int counter = 0;

			if (arr1[0] == 1) {
				counter++;
			}
			if (arr2[0] == 1) {
				counter++;
			}
		
		return counter;

	}

}
