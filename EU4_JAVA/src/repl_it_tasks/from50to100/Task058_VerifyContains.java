package repl_it_tasks.from50to100;
import java.util.Scanner;

public class Task058_VerifyContains {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();

		      if(sentence.contains(word)){
					  System.out.println(true);
					
			  }else{
				    System.out.println(false);
			  }
	}

}
