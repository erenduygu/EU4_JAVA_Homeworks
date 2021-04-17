package repl_it_tasks.from150to200;

public class Task188_MethodOverloading {

	public static void main(String[] args) {
		int[] x = { 1, 5, 6, 8,2,1,10 };
		double[] y = { 1.2, 5.4, 6.8,9.1 };
		System.out.println(findMax(x));
		System.out.println(findMax(y));

	}

	public static int findMax(int[] arr) {

		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				num = arr[i];

			}
		}
		return num;

	}

	public static double findMax(double[] arr) {

		double num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				num = arr[i];

			}
		}
		return num;

	}
}
