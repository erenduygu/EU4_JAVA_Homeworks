package repl_it_tasks.from1to50;
import java.util.Scanner;
public class Task031_ConsoleMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    Scanner s = new Scanner(System.in);
		    
		    System.out.println("---------------");
		    System.out.println("select an option:");
		    System.out.println("1) option 1");
		    System.out.println("2) option 2");
		    System.out.println("3) option 3");
		    System.out.println("---------------");
		    
		    int choice = s.nextInt();

		    
		    if (choice==1) {
			    System.out.println("user selected 1");
		    }else
		    
		    if (choice==2) {
			    System.out.println("user selected 2");
		    }
		    if (choice==3){
			    System.out.println("user selected 3");
		    }
		  }
		}