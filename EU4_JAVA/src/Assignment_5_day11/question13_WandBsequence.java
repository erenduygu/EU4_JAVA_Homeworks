package Assignment_5_day11;

public class question13_WandBsequence {

	public static void main(String[] args) {

		/*
		 * for (int k = 1; k <= 4; k++) {
		 * 
		 * for (int i = 1; i <= 4; i++) { { System.out.print("W " + "B "); }
		 * 
		 * } System.out.println(" ");
		 * 
		 * for (int j = 1; j <= 4; j++) { { System.out.print("B " + "W "); }
		 * 
		 * } System.out.println(" ");
		 * 
		 * } } }
		 */

		for (int row = 1; row <= 8; row++) {
			if (row % 2 == 1) {
				for (int col = 1; col <= 8; col++) {
					if (col % 2 == 1) {
						System.out.print("W");
					} else {
						System.out.print("B");
					}
					System.out.print(" ");
				}
			} else {
				for (int col = 1; col <= 8; col++) {
					if (col % 2 == 1) {
						System.out.print("B");
					} else {
						System.out.print("W");
					}
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}
}
