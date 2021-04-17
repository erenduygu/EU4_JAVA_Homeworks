package repl_it_tasks.from200to250;

import java.util.Arrays;

public class Task210_ReverseLetters {

	public static void main(String[] args) {

		System.out.println(reverseLetters("----re[eer]..,/")); // true

		System.out.println(reverseLetters("---abmkl.o-")); // true

	}

	public static String reverseLetters(String word) {

		char[] arr = word.toCharArray();
		char temp;
		int j = 0, i = 0;

		while (i < arr.length - 1 - j) {
			if (Character.isLetterOrDigit(arr[i])) {
				if (Character.isLetterOrDigit(arr[arr.length - 1 - j])) {
					temp = arr[i];
					arr[i] = arr[arr.length - 1 - j];
					arr[arr.length - 1 - j] = temp;

					if (arr[i] == '[') {
						char tempInner;
						int bracket = Arrays.binarySearch(arr, ']');
						tempInner = arr[i + 1];
						arr[i + 1] = arr[bracket - 1];
						arr[bracket - 1] = tempInner;

					}
					i++;
					j++;
				} else
					j++;
			} else
				i++;
		}
		String word1 = "";
		for (char each : arr) {
			word1 += each;
		}

		return word1;
	}
}
