package repl_it_tasks.from150to200;

import java.util.ArrayList;
import java.util.Arrays;

public class Task195_ArraylistSum {

	public static void main(String[] args) {

		ArrayList<Integer> newList=new ArrayList<>(Arrays.asList(1,5,9,4,8,3));
		
		
		System.out.println(sum(newList));
		
	}	public static int sum(ArrayList<Integer> ints)
	{
		  int sum=0;
	    for (int each:ints){
	      sum+=each;
	    }		return sum;
		}

}
