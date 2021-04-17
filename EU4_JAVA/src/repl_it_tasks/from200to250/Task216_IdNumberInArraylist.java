package repl_it_tasks.from200to250;

import java.util.ArrayList;

public class Task216_IdNumberInArraylist {
	
	public String blogDb(ArrayList<String[]> r,String id)  {
		    
	     
		 String [] result=new String[3];
		 
		    for(String[] each : r) {
		    	for (String str : each) {
		    		if(str.equals(id)) {
		    			result=each;
		    		}
		    	}
		    }
		    String str=result[1]+"\n"+result[2];
			return str;
		    		   
		  }
  public static void main(String[] args) {
	  Task216_IdNumberInArraylist m = new Task216_IdNumberInArraylist();
    ArrayList<String[]>  arr = new ArrayList<String[]>();
    arr.add(new String[]{"1","title 1","content"});
    arr.add(new String[]{"2","title 2","content"});
    arr.add(new String[]{"3","title 3","content3"});

    String post = m.blogDb(arr,"3");
    System.out.print(post);
    //should output:
    //title 3 
    //content3
   
    
  }//end main
}