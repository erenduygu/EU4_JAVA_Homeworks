package Lab_4;

public class Question08_ContainsTwoThree {

	public static void main(String[] args) {

		int[] x = { 2, 5 };
		int[] y = { 4, 3 };
		int[] z = { 4, 5 };

		twoThree(x);
		twoThree(y);
		twoThree(z);

		System.out.println(twoThree(x));
		System.out.println(twoThree(y));
		System.out.println(twoThree(z));

	}

	public static boolean twoThree(int[] arr) {

		for (int each : arr) {
			if (each == 2 || each == 3) {
				return true;
			}
		}
		return false;
	}

}
