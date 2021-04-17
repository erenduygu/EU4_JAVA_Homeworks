package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task138_ReverseSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here

		String[] reverseArray = sentence.split(" ");

		for (int i = reverseArray.length - 1; i >= 0; i--) {
			reversed += reverseArray[i] + " ";
		}
		reversed = reversed.trim();

		// End your code here. do not modify below statement
		System.out.println(reversed);

	}
}