package repl_it_tasks.from50to100;
import java.util.Scanner;

public class Task097_CountJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int countJava = 0;
		int wordCound = word.length();
		int countOfLetters = 4;

		for (int i = 0; i <= wordCound - countOfLetters; i++) {

			String currentWord = word.substring(i, i + countOfLetters);

			if (currentWord.equals("java")) {
				countJava++;
			}

		}
		System.out.println(countJava);

	}
}
