package Assignment_9;

public class Question4_MiddleThree {

	public static void main(String[] args) {

		String word = "javac";

		if (word.length() % 2 == 0)
			System.out.println("invalid");
		else {
			if (word.length() >= 5) {
				for (int i = word.length() / 2 - 1; i <= word.length() / 2 + 1; i++) {
					System.out.print(word.charAt(i));
				}

			}
		}

	}

}
