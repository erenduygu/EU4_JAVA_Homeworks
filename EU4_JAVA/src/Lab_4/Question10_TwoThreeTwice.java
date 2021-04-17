package Lab_4;

public class Question10_TwoThreeTwice {

	public static void main(String[] args) {

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] a = { 2, 3 };
		int[] b = { 12, 20, 42 };
		int[] c = { 2, 2, 2 ,3};

		System.out.println(twoThreeTwice(x));
		System.out.println(twoThreeTwice(y));
		System.out.println(twoThreeTwice(a));
		System.out.println(twoThreeTwice(b));
		System.out.println(twoThreeTwice(c));

	}

	public static boolean twoThreeTwice(int[] arr) {

		int counter2 = 0;
		int counter3 = 0;

		for (int each : arr) {
			if (each == 2) {
				counter2++;
			} else if (each == 3) {
				counter3++;

			}

		}
		if (counter2 == 2 || counter3 == 2) {
			return true;
		}

		return false;

	}

}
