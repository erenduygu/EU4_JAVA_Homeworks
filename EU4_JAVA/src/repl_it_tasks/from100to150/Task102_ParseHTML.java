package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task102_ParseHTML {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		int index1 = html.indexOf("id=");
		int index2 = html.indexOf("\"", index1);
		int index3 = html.indexOf("\"", index2 + 1);

		

		if (!html.contains("html")) {
			System.out.println("Invalid input!");
		} else {
			System.out.println(html.substring(index2 + 1, index3));
		}

	}
}