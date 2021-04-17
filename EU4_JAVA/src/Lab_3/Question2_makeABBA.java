package Lab_3;

public class Question2_makeABBA {

	public static void main(String[] args) {

		
		System.out.println(makeAbba("Hi","Bye"));
		System.out.println(makeAbba("Yo","Alice"));
		System.out.println(makeAbba("What","Up"));


	}public static String makeAbba(String s1, String s2) {
		
		return s1.concat(s2).concat(s2).concat(s1);
		
	}

}
