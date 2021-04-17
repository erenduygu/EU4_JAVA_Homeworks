package repl_it_tasks.from200to250;

public class Task209_String_ExtractNumbers {

	public static void main(String[] args) {
		

		String s = "aa!!%$#.10aa";
		String str = "";

		for (Character ch : s.toCharArray()) {
			if (ch.isDigit(ch)) {
				str += ch;
			}

		}
		System.out.println(str);

	}
}