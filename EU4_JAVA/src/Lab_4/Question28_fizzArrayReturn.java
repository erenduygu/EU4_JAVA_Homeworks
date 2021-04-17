package Lab_4;

import java.util.Arrays;

public class Question28_fizzArrayReturn {

	public static void main(String[] args) {

		fizzArray3(5, 10); // [5, 6, 7, 8, 9]
		fizzArray3(11, 18); // [11, 12, 13, 14, 15, 16, 17]
		fizzArray3(1, 3); // [1, 2]

		System.out.println(Arrays.toString(fizzArray3(5, 10)));
		System.out.println(Arrays.toString(fizzArray3(11, 18)));
		System.out.println(Arrays.toString(fizzArray3(1, 3)));

		
		
	}public static int[] fizzArray3(int num1,int num2) {
		int [] newArray=new int[num2-num1];
		
		int x=num1;
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=x;
			x++;
		}return newArray;
	}

}
