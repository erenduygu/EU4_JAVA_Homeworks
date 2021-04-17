package repl_it_tasks.from150to200;

import java.util.ArrayList;

public class Task187_lameDb {

	public static void main(String[] args) {
	
			
			System.out.print(
				       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
				       );
			System.out.print(
				       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
				       );
			System.out.print(
				       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
				       );
				       
				        System.out.print(
				       lameDb("1tst#2bla#3foo","none","1","")+"\n"
				       );
			}
	private static String lameDb(String db, String op, String id, String data) {
		
			String new_text="";
			String[] spltparts=db.split("#");
			ArrayList <String> parts = new ArrayList<>() ;
			
			for (int i=0;i<spltparts.length;i++) {
				parts.add(spltparts[i]);
			}
			
			switch (op) {
			case "add":
				parts.add(id+data);
				break;
			case "edit":
				parts.set(Integer.parseInt(id)-1, id+data);
				break;
			case "delete":
				parts.remove(Integer.parseInt(id)-1);
				break;
			case "none":
				break;
			}
			
			for (String eachPart: parts) {
				new_text+="#"+eachPart;
			}
			
			return new_text.substring(1);
		}
	}
	



