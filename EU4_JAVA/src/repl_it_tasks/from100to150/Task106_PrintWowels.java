package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task106_PrintWowels {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();

		for (int i = 0; i <= word.length() - 1; i++) {
			char find = word.charAt(i);
			if (find == 'a' || find == 'e' || find == 'i' || find == 'o' || find == 'u') {
				System.out.print(find);
			}
		}

	}
}