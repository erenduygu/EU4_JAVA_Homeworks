package Lab_4;

public class Question17_DifferenceBetweenNumbers {

	public static void main(String[] args) {

		int[] x = { 10, 3, 5, 6 };
		int[] y = { 7, 2, 10, 9 };
		int[] z = { 2, 10, 7, 2 };

		System.out.println(difference(x));
		System.out.println(difference(y));
		System.out.println(difference(z));

	}

	public static int difference(int[] arr) {

		int largest = arr[0];
		for (int each : arr) {
			if (each > largest) {
				largest = each;
			}
		}

		int smallest = arr[0];
		for (int each : arr) {
			if ( each < smallest) {
				smallest = each;
			}
		}
		return largest - smallest;
	}

}
