package repl_it_tasks.from150to200;

public class Task179_uniqueLetters {

	public static void main(String[] args) {
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {

		String unique="";
		
		
		for (int i = 0; i < str.length(); i++) {
		//	char letter = str.charAt(i);


			if (!unique.contains("" + str.charAt(i))) {
				
				unique+= ""+str.charAt(i);

			}
		
		}	return unique;
	}
}