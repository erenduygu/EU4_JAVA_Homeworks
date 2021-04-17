package repl_it_tasks.from100to150;

import java.util.Arrays;

public class Task143_2DMultiplicationTable {

	public static void main(String[] args) {
		 int [][] multiplicationTable = new int[10][10];
		    
		 for(int i=0;i<10;i++){
		   for(int j=0;j<10;j++){
		     multiplicationTable[i][j]=(i+1)*(j+1);
		   }
		 }    
			    
			    //Do not modify below line it will be used to test your code. And 
			    //Can be used by you while developing your code
			    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
			  }
}