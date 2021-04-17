package repl_it_tasks.from100to150;

import java.util.Arrays;

public class Task129_Arrays_copyCertainValues {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {
		int count = 0;
		for (String each : arr) {
			if (each.contains("e"))
				count++;
		}
		String[] fewValues = new String[count];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				fewValues[index] = arr[i];
				index++;
			}

		}
		return fewValues;

	}
}