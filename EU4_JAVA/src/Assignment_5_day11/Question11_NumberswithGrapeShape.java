package Assignment_5_day11;

public class Question11_NumberswithGrapeShape {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; ++i) {

			for (int j = 4; j > i; j--) {
				System.out.print((j - i) + " ");

			}

			System.out.println(" ");

			for (int k = 1; k <= i + 1; k++) {
				System.out.print(" ");
			}

		}

	}
}
