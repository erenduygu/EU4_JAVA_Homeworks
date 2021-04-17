package repl_it_tasks.from150to200;

public class Task186_RemoveFirst {

	public static void main(String[] args) {
System.out.println(removeFirst("helllllerr"));
	}

	public static String removeFirst(String target) {

		target = target.replace(target.substring(0, 1), "");
		return target;

	}
}