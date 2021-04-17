package Lab_4;

public class Question16_EvenNumbers {

	public static void main(String[] args) {

		int[] x = { 2, 1, 2, 3, 4 };
		int[] y = { 2, 2, 0 };
		int[] z = { 1, 3, 5 };

		System.out.println(evenNumbers(x));
		System.out.println(evenNumbers(y));
		System.out.println(evenNumbers(z));

	}

	public static int evenNumbers(int[] arr) {
	

		int count = 0;
		for (int each : arr) {
			if (each % 2 == 0) {
				count++;
			}
		}
		return count;

	}

}
