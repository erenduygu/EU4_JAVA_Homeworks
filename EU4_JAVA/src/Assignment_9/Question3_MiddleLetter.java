package Assignment_9;

public class Question3_MiddleLetter {

	public static void main(String[] args) {

		String word = "J";

		if (word.length() == 1) {
			for (int i = 1; i < 4; i++) {
				System.out.print(word.charAt(0));
			}
		}
		if (word.length() >= 3) {
			if (word.length() % 2 == 1) {
				System.out.println(word.charAt(word.length() / 2));
			}
		}

	}

}
