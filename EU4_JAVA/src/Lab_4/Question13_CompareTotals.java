package Lab_4;

import java.util.Arrays;

public class Question13_CompareTotals {

	public static void main(String[] args) {

		int[] x = { 1, 2 };
		int[] y = {3,4};

		int[] a = { 5,6};
		int[] b = { 3,8 };

		int[] i = { 1,1 };
		int[] t = { 1,0 };
	
	compareTotals(x, y);
	compareTotals(a, b);
	compareTotals(i, t);
	
	}public static void compareTotals(int[]arr1,int[]arr2) {
		
		int total1=0;
		for(int each:arr1) {
			total1+=each;
		}
		int total2=0;
		for(int each:arr2) {
			total2+=each;
		}
		if(total1>total2) {
			System.out.println(Arrays.toString(arr1));
		}else if (total2>total1) {
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("equal");
		}
	}

}
