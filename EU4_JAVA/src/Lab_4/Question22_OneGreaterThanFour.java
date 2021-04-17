package Lab_4;

public class Question22_OneGreaterThanFour {

	public static void main(String[] args) {
		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 1, 4,4,4 };
		int[] z = { 2, 1, 2, 2, 2 };

		System.out.println(oneGreaterThanFour(x));
		System.out.println(oneGreaterThanFour(y));
		System.out.println(oneGreaterThanFour(z));

	}

	public static boolean oneGreaterThanFour(int[] arr) {

		int count1 = 0;
		int count4=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count1++;
			}else 	if (arr[i] == 4) {
				count4++;
			}
		}
		if (count1>count4) {
			return true;
		}
		return false;

	}

}