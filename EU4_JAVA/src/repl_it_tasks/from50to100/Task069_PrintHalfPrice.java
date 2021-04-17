package repl_it_tasks.from50to100;
import java.util.Scanner;
public class Task069_PrintHalfPrice {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();


		  String wordHalf=word.substring(0,(word.length()/2));
		  System.out.println(wordHalf+wordHalf);

		  }
		}