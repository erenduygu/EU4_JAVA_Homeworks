package Lab_1_Methods;

public class Question3_SpecialEleven {

	public static void main(String[] args) {
		specialEleven(22) ;
		specialEleven(23) ;
		specialEleven(24) ;
	}

	public static void specialEleven(int num) {

		if (num % 11 == 0 || num % 11 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
