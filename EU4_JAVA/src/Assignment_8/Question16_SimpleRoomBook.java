package Assignment_8;

public class Question16_SimpleRoomBook {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(true, 7, 2, 2018));
	}

	public static boolean simpleRoomBook(boolean b1, int month, int day, int year) {

		if (b1 == true && year == 2018) {
			if (month == 7 && (day >= 1 && day <= 7)) {
				return false;
			} else
				return true;
		} else
			return false;
	}

}
