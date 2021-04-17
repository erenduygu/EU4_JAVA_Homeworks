package repl_it_tasks.from150to200;

public class Task184_At3Char {

	public static void main(String[] args) {
System.out.println( at3("longword","foo"));
	}

	public static String at3(String target, String word) {
		
		target = target.substring(0, 3) + word + target.substring(3);

		return target;

		
	}
}