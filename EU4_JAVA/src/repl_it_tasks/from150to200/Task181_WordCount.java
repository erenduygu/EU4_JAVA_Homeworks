package repl_it_tasks.from150to200;

public class Task181_WordCount {

	public static void main(String[] args) {

		wordCount("one two three");
		System.out.println(wordCount("one two three four five six"));
	}

	public static int wordCount(String words) {

		String[] allWords=words.split(" ");
		return allWords.length;
		
		/*int count = 0;

		for (int i = 0; i <= words.length() - 1; i++) {

			char letter = words.charAt(i);

			if (letter == (' ')) {
				count++;
			}
		}
		return count+1;
*/
		
		
	}

}