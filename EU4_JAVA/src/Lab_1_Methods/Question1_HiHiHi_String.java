package Lab_1_Methods;

public class Question1_HiHiHi_String {

	public static void main(String[] args) {

		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}

	public static void stringTimes(String hi, int num) {

		for (int i = 0; i < num; i++) {
			System.out.print(hi);
		}
		System.out.println();

	}

}
