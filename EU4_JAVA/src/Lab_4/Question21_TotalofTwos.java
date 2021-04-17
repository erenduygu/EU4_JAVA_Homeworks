package Lab_4;

public class Question21_TotalofTwos {

	public static void main(String[] args) {

		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 1, 2, 2, 2 };
		int[] z = { 2, 1, 2, 2, 2 };

		System.out.println(totalOfTwo(x));
		System.out.println(totalOfTwo(y));
		System.out.println(totalOfTwo(z));

	}

	public static boolean totalOfTwo(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				sum += arr[i];
			}
		}
		if (sum == 8) {
			return true;
		}
		return false;

	}

}
