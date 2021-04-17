package Assignment_5_day11;

public class Question9_OddNumbersWithoutComma {

	public static void main(String[] args) {

		int endNum = 10;

		for (int i = 1; i <= endNum; i++) {
			if (i % 2 == 1) {
				System.out.print(i);
				if (endNum % 2 == 1 && i != endNum) {
					System.out.print(",");
				} else if (endNum % 2 == 0 && i != endNum - 1) {
					System.out.print(",");
				}

			}
		}

	}
}

/*
 * int endNum=4; int i=0;
 * 
 * while (i<endNum) {i++; if (i%2==1) { if (i==endNum) { System.out.println(i);
 * } if (i!=endNum) { if (i==endNum-1) { System.out.println(endNum-1); } else {
 * System.out.print(i+",");} } }
 * 
 * }
 * 
 * }
 * 
 * }
 */

/*
 * for (i = 0; i <= endNum; i++) { if (i%2==1) { if (i==endNum) {
 * System.out.print(i); } if (i!=endNum && i=endNum-1) { System.out.println(i);
 * } else { System.out.print(i+","); } } }
 * 
 * } } }
 * 
 */
