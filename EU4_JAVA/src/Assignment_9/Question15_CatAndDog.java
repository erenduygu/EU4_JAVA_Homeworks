package Assignment_9;

import java.util.Scanner;

public class Question15_CatAndDog {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		int wordCharCount = word.length();
		int targetCharCount = 3;

		for (int i = 0; i <= wordCharCount - targetCharCount; i++) {

			String currentWord = word.substring(i, i + targetCharCount);

			if (currentWord.equals("cat")) {
				countOfCats++;

			} else if (currentWord.equals("dog")) {
				countOfDogs++;

			}
		}

		System.out.println(countOfCats == countOfDogs);
	}
}