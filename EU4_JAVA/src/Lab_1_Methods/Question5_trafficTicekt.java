package Lab_1_Methods;

public class Question5_trafficTicekt {

	public static void main(String[] args) {

		caughtSpeeding(60, false); 
		caughtSpeeding(65, false);
		caughtSpeeding(65, true) ;

	}

	public static void caughtSpeeding(int speed, boolean birthday) {

		if (birthday) {

			if (speed >= 0 && speed <= 65) {
				System.out.println("0");
			} else if (speed >= 66 && speed <= 85) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		} else {
			if (speed >= 0 && speed <= 60) {
				System.out.println("0");
			} else if (speed >= 61 && speed <= 80) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}

	
	}

}
