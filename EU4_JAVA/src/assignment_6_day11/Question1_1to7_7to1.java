package assignment_6_day11;

public class Question1_1to7_7to1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println(" ");
		}

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(j + " ");

			}
			System.out.println(" ");
		}
	}

}
