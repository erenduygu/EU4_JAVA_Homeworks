package repl_it_tasks.from50to100;
import java.util.Scanner;
public class Task098_CountHi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int wordLength = str.length();
		int countOfLetter = 2;
		int countofHi = 0;

		for (int i = 0; i <= wordLength - countOfLetter; i++) {

			String currentWord = str.substring(i, i + countOfLetter);

			if (currentWord.equals("hi")) {
				countofHi++;
			}
		}
		System.out.println(countofHi);
	}
}