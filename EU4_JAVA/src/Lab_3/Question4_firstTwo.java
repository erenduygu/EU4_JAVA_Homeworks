package Lab_3;

public class Question4_firstTwo {

	public static void main(String[] args) {

		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("H"));
		System.out.println(firstTwo("      "));
		System.out.println(firstTwo("abcdggg"));



	}

	public static String firstTwo(String word) {

		if (word.length() < 2) {
			return word;
		} else if (word.isEmpty()) {
			return "";
		} else {
			return word.substring(0, 2);
		}
	}

}
