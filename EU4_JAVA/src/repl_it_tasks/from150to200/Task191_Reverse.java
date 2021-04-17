package repl_it_tasks.from150to200;

public class Task191_Reverse {

	public static void main(String[] args) {

		System.out.println(reverse("interesting"));
	}
	
	public static String reverse(String input) {
		
		String newWord="";
		for (int i = input.length()-1; i >=0 ; i--) {
			
			newWord+=input.charAt(i);
			
		}return newWord;
		 
	}

}
