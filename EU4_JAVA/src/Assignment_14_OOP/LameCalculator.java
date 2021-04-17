package Assignment_14_OOP;

public class LameCalculator {

	public static void main(String[] args) {

		LameCalculator lc= new LameCalculator();
		
		System.out.println(lc.plus(1, 1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));
	}
	
	public int plus (int x,int y) {
		return x+y;
		
	}
	public int minus (int x,int y) {
		return x-y;
		
	}
	public int multiply (int x,int y) {
		return x*y;
		
	}
	public int divide (int x,int y) {
		return x/y;
		
	}

	

}
