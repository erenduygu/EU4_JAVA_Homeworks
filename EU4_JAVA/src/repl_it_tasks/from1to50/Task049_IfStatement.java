package repl_it_tasks.from1to50;

import java.util.Scanner;

public class Task049_IfStatement {

	public static void main(String[] args) {

Scanner s=new Scanner(System.in);

System.out.println("Enter your score: ");
int grade=s.nextInt();

if (grade>=90) {System.out.println("excellent");}
else if (grade>=70&&grade<90) {System.out.println("good"); }
else if (grade>=60&&grade<70) {System.out.println("pass"); }
else if (grade<60) {System.out.println("fail"); 	
}

		
	}

}
