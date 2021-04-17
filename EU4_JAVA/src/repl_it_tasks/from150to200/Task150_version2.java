package repl_it_tasks.from150to200;

public class Task150_version2 {

	public static void main(String[] args) {

		int row=5;
		int col=5;
		
		for (row = 1; row <=5 ; row++) {
			for (col = 1; col <=5; col++) {
				
				if (row==1||row==5||col==1||col==5) {
					System.out.print("*");
				}else {System.out.print(" ");}
				
			}System.out.println();
			
		}
		
	}

}
