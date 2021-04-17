package repl_it_tasks.from200to250;

import java.util.ArrayList;
import java.util.Arrays;

public class Task213_ArrayListRemoveInstance {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1,1,2,3,1,4 };
		arr.addAll(Arrays.asList(nums));

		System.out.print(removeInst(arr, 1));

	}

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i).equals(n)) {
				r.remove(n);
				i--;
			
			}
		}
		return r;

	}

}
