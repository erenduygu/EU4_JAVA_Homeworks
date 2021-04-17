package Lab_4;

public class Question26_EvenOdd3Values {

	public static void main(String[] args) {

		int x[] = { 2, 1, 3, 5 }; // true
		int y[] = { 2, 1, 2, 5 }; // false
		int z[] = { 2, 4, 2, 5 }; // true

		System.out.println(evenOdd(x));
		System.out.println(evenOdd(y));
		System.out.println(evenOdd(z));

	}

	public static boolean evenOdd(int[] arr) {

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else
				countOdd++;

		}
		return countEven == 3 || countOdd == 3;

	}

}
