package Assignment_8;

public class Question14_TruthTable {

	public static void main(String[] args) {
		
		
		System.out.println(threeLocks(true, true,false));
	}

	public static Boolean threeLocks(boolean b1, boolean b2, boolean b3) {

		if ((b1 == true && b2 == true)||b3==true)
			return true;

		return false;
	}
}
