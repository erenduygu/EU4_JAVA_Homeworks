package Lab_4;

public class Question02_CheckFirstLast {

	public static void main(String[] args) {

		int[] x = { 1, 2, 6,1 };
		int[] y = { 1, 2, 3,  };
		int[] z = { 1, 2, 1 };
		int[] k = { 1 };

		System.out.println(checkNum(x));
		System.out.println(checkNum(y));
		System.out.println(checkNum(z));
		System.out.println(checkNum(k));

	}

	public static String checkNum(int[] arr) {


		if (arr.length > 1) {

			if (arr[0] == arr[(arr.length - 1)]) {
				return "true";
			} else {
				return "false";
			}
		}else {
		 return "not a valid array";
		}
		
	}

}
