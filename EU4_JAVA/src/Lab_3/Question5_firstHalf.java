package Lab_3;

public class Question5_firstHalf {

	public static void main(String[] args) {

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abc de fgh"));
		System.out.println(firstHalf("abc d fgh"));

	}

	public static String firstHalf(String str) {

		if (str.length() % 2 == 0) {
			return str.substring(0, str.length() / 2);
		} else {
			return "nothing";

		}
	}

}
