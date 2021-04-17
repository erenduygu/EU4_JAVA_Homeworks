package Lab_4;

public class Question27IncreasingAdjacentNumbers {

	public static void main(String[] args) {

		int[] x = { 1, 4, 5, 6, 2 }; // true
		int[] y = { 1, 2, 3 }; // true
		int[] z = { 1, 2, 4, 5, 8, 9 }; // false

		System.out.println(evenOdd(x));
		System.out.println(evenOdd(y));
		System.out.println(evenOdd(z));

	}

	public static boolean evenOdd(int[] arr) {

		for (int i = 0; i < arr.length-2; i++) {

			int x = arr[i];

			if (arr[i + 1] == x + 1 && arr[i + 2] == x + 2)
				return true;

		}
		return false;
	}
}
