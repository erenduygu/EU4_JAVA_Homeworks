package repl_it_tasks.from150to200;

public class Task163_MethodsCountAppearance {

	public static void main(String[] args) {
		
		String[] k= {"a","foo","bar","foo","bla","zeyno","a","a",};
		String l="a";

		System.out.println(count_appearance(k,l));
	}

	public static int count_appearance(String[] arr, String t) {

		int num = 0;
		for (String each : arr) {
			if (each == t) {
				num++;
			}
		}
		return num;

	}

}
