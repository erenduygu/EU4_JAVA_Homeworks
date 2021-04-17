package repl_it_tasks.from150to200;

import java.util.ArrayList;
import java.util.Arrays;

public class Task198_CombineAll {

	public static void main(String[] args) {

		ArrayList<Boolean> wordList = new ArrayList<Boolean>(Arrays.asList(true, false, false));

//		String targetWord = "hi";
//		removeAll(wordList, targetWord);

		System.out.println(repeatAL(wordList));

	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {

	}

	public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> list1) {

		int size = list1.size();
		for (int i = 0; i < size; i++) {
			list1.add(list1.get(i));
			
			
		}
		return list1;
		

	}
}