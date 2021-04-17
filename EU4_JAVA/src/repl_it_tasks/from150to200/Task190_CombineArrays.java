package repl_it_tasks.from150to200;

public class Task190_CombineArrays {

	public static int[] mergR(int[] a, int[] b) {

		int[] arr = new int[a.length + b.length];

		for (int i = 0; i < arr.length; i++) {

			if (i < a.length) {
				arr[i] = a[i];

			} else {
				arr[i] = b[i - a.length];
			}

		}
		return arr;

	}// end mergR

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
