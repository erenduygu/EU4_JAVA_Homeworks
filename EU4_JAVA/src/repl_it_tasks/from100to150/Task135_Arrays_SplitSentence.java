package repl_it_tasks.from100to150;

import java.util.Arrays;
import java.util.Scanner;

public class Task135_Arrays_SplitSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		
		String[] x=sentence.split(" ");
		for(String each:x) {
			System.out.println(each);
		}
		
		/*
		System.out.println(Arrays.toString(array(sentence)));

	}

	public static String[] array(String arr) {
		String[] arrays = arr.split(" ");
		return arrays;*/
	}

}