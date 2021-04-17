package Assignment_4;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(4, -6, 3, -8, 0, 4, 3));
		System.out.println(appendPosSum(x));

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arrl) {
		int sum = 0;
		ArrayList<Integer> newArr = new ArrayList<>();
		for (int i = 0; i < arrl.size(); i++) {
			if (arrl.get(i) > 0) {
				newArr.add(arrl.get(i));
				sum += arrl.get(i);

			}

		}
		newArr.add(sum);

		return newArr;

	}

}
