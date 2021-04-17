package repl_it_tasks.from50to100;

public class Task091_PrintLetterCombination {

	public static void main(String[] args) {


		for(char i='z';i>='v';i--) {
			for(char j='z';j>='v';j--) {
				System.out.println(i+""+j);
			}
		}
	}

}
