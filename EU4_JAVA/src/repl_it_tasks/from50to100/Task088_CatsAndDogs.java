package repl_it_tasks.from50to100;

import java.util.Scanner;

public class Task088_CatsAndDogs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		int wordCharCount = word.length();
		int targetCharCount = 3;

		for (int i = 0; i <= wordCharCount - targetCharCount; i++) {
			// System.out.println(word.substring(i,i+targetCharCount));

			String currentWord = word.substring(i, i + targetCharCount);
			//System.out.println(currentWord);

			if (currentWord.equals("cat")) {
				countOfCats++;
				
				
				//System.out.println("cat found");
			} else if (currentWord.equals("dog")) {
				countOfDogs++;
				
			//	System.out.println("dog found");

			}
		}
		//System.out.println(countOfCats);
		//System.out.println(countOfDogs);
		System.out.println(countOfCats==countOfDogs);
	}
}