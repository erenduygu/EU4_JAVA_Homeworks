package repl_it_tasks.from150to200;

import java.util.ArrayList;

public class Task193_Arraylist_CombineArrays {

	public static void main(String[] args) {
		  String[] r1={"f","o","o"};
		    String[] r2={"b","a","r"};
		    
		    System.out.println(combineRs(r1,r2));
		  }
		  public static String combineRs(String[] r1,String[] r2) 
		  {
		    
		    ArrayList<String> newList=new ArrayList<>();
		  for (String each1:r1){
		    newList.add(each1);
		  }
		  for (String each2:r2){
		    newList.add(each2);
		  }
		  
		  String list="";
		  
		  for (String s:newList){
		    list+=s;
		    
		  }
		  
		   return list;
		  }
		}