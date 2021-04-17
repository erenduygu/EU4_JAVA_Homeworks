package Lab_4;

public class Question03_TwoArrays {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 7, 3 };

		System.out.println(checkArrays(x, y));

	}

	public static String checkArrays(int[] arr1, int[] arr2) {

		if (!(arr1.length > 1)) {
			return "Array1 is not a valid array";
		}
		if (!(arr2.length > 1)) {
			return "Array2 is not a valid array";

		}
		if (arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
			return "true";

		}
		return null;

	}
}
