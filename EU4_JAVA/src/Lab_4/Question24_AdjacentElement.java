package Lab_4;

public class Question24_AdjacentElement {

	public static void main(String[] args) {

		int[] x = { 1, 2, 1, 2, 1 };
		int i = 1;

		System.out.println(adjacentElement(x, i));

	}

	public static boolean adjacentElement(int[] arr, int num) {

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == num && (arr[i + 1] == num || arr[i + 2] == num)) {
				return true;
			}

		}
		return false;
	}

}