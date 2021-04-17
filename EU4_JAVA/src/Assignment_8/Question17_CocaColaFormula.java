package Assignment_8;

public class Question17_CocaColaFormula {

	public static void main(String[] args) {

		System.out.println(getThunderBlazz(false, false, 3,1,2));
	}

	public static boolean getThunderBlazz(boolean available, boolean gift, int ing1, int ing2, int ing3) {

		if (available == true || gift == true) {
			return true;
		} else if ((ing1 == 1 && ing2 == 2 && ing3 == 3) || (ing1 == 3 && ing2 == 1 && ing3 == 2)) {
			return true;

		} else
			return false;
	}
}