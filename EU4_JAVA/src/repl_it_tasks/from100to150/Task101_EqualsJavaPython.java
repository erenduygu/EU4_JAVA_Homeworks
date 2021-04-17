package repl_it_tasks.from100to150;

import java.util.Scanner;

public class Task101_EqualsJavaPython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int sentencelength = sentence.length();
		int javaIndex = 4;
		int pythonIndex = 6;
		int javaCount = 0;
		int pythonCount = 0;

		for (int i = 0; i <= sentencelength - javaIndex; i++) {
			String targetJava = sentence.substring(i, i + javaIndex);
			if (targetJava.equals("java")) {
				javaCount++;
			}
		}
		for (int i = 0; i <= sentencelength - pythonIndex; i++) {
			String targetJava = sentence.substring(i, i + pythonIndex);
			if (targetJava.equals("python")) {
				pythonCount++;
			}
		}
		System.out.println(javaCount+","+pythonCount);
		System.out.println(javaCount == pythonCount);
	}
}