package repl_it_tasks.from200to250;

public class Task207_FirstLastDigitChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] do_switch(int[] i) 
	 {

	  int temp=i[0];
	  
	  i[0]=i[i.length-1];
	  i[i.length-1]=temp;
	  
	  return i;
	  


		}

}
