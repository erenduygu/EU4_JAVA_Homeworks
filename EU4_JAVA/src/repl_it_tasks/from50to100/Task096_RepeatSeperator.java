package repl_it_tasks.from50to100;
import java.util.Scanner;

public class Task096_RepeatSeperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		for (int i = 1; i <= count - 1; i++) {
			System.out.print(word + separator);

		}
		System.out.print(word);

	}

}
