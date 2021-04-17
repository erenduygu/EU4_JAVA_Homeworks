package Lab_1_Methods;

public class Question6_numberOFCigar {

	public static void main(String[] args) {
		cigarParty(30, false);
		cigarParty(50, false) ;
		cigarParty(70, true);
	}

	public static void cigarParty(int numberOfCigar, boolean isWeekend) {

		if (!isWeekend) {
			if (numberOfCigar >= 40 && numberOfCigar <= 60) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			if (numberOfCigar >= 40) {
				System.out.println("true");
			} else {
				System.out.println("false");

			}
		}

	}
}