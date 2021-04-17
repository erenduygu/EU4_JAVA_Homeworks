package repl_it_tasks.from100to150;

import java.util.Arrays;

public class Task140_ArraysPrintFirstLast {

	public static void main(String[] args) {

		String[] words = { "hello", "why", "by", "apple", "note" };

		String[] arr = new String[words.length];


		for (int j = 0; j < words.length; j++) {
			

			arr[j] = words[j].charAt(0) + "" + words[j].charAt(words[j].length() - 1);

		
			

		}System.out.println(Arrays.toString(arr));

	}
}