package repl_it_tasks.from200to250;

import java.util.ArrayList;
import java.util.Arrays;

public class Task215_ArrayList_2Times {

	public static void main(String[] args) {

		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,5,3));
		System.out.println(twoTimes(x));

	}

	 public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrl) {
		 
		 for (int i = 0; i < arrl.size(); i=i+2) {
			arrl.add(i+1, arrl.get(i));
		}
		 
		 
		 
		return arrl;


		
		}

	}




/*	for (int i = 0; i < arrl.size(); i += 2) {
	arrl.add(i + 1, arrl.get(i));

}

return arrl;*/