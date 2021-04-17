package Assignment_5_day11;

public class testTest {

	public static void main(String[] args) {

		
		
		int count = 8;
		long factorial = 1;

		for (int i = 1; i <= count; i++) {

			factorial = factorial * i;

		}
		System.out.println("Factorial of " + count + " is " + factorial);
		
		System.out.println(sum(2,2));
	}public static float sum(int num1,int num2) {
		 float sum = num1+num2;
		 return sum;
	
	}public static float sum(int num1,int num5, int num3) {
		 float sum = num1+num3;
		 return sum;
	
	}
	

}
