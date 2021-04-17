package repl_it_tasks.from150to200;

public class Task178_MergeThem {

	public static void main(String[] args) {
	}

	public static String mergeStrings(String one, String two) {

		String merged = "", longerStr = "";
		int shorterCharCNT = 0;

		if (one.length() > two.length()) {

			longerStr = one;
			shorterCharCNT = two.length();

		} else {
			longerStr = two;
			shorterCharCNT = one.length();

		}
		// merged=""+one.charAt(0)+two.charAt(0)

		for (int i = 0; i < shorterCharCNT; i++) {
			merged += "" + one.charAt(i) + two.charAt(i);
		}
		merged += longerStr.substring(shorterCharCNT);

		return merged;
	}
}