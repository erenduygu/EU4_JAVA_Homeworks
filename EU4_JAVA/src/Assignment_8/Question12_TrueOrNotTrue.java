package Assignment_8;

public class Question12_TrueOrNotTrue {

	public static void main(String[] args) {
		System.out.println(hamletQuote(false, true));
	}

	public static Boolean hamletQuote(boolean b1, boolean b2) {

		if (b1 == false && b2 == false)
			return false;

		return true;
	}
}
