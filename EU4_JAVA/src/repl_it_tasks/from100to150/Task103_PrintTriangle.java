package repl_it_tasks.from100to150;
import java.util.Scanner;
public class Task103_PrintTriangle {

	public static void main(String[] args) {
	    int i = 1;
			int j = 1;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("please enter your number:");
			int n = scan.nextInt();
			
			for(i=1;i<=n;i++) {
				 for(j=1;j<=i;j++) {
					 System.out.print("*");
			     } System.out.println(" ");
			}
	     
	}

}
