package Lab_4;

public class Question19_BetweenSixSeven {

	public static void main(String[] args) {

		int[] x = { 1, 2, 2 }; // = > 5
		int[] y = { 1, 2, 2, 6, 99, 99, 7 }; // = > 5
		int[] a = { 1, 1, 6, 7, 2 }; // = > 4
		int[] b = { 1, 1, 6, 2 }; // = > 2
		int[] c = { 1, 2, 2, 6, 99, 99, 7, 3, 4 }; // = > 12

		betweenSixSeven(x);
		betweenSixSeven(y);
		betweenSixSeven(a);
		betweenSixSeven(b);
		betweenSixSeven(c);
		

	}

	public static void betweenSixSeven(int[] arr) {

		int total = 0;
		boolean boolCheckSix = false;

		for (int i = 0; i < arr.length; i++) {

			if (boolCheckSix) {
				if (arr[i] == 7) {
					boolCheckSix = false;
				}

			} else if (arr[i] == 6) {
				boolCheckSix = true;

			} else {
				total += arr[i];
			}
		}
		System.out.println(total);
	}

}
