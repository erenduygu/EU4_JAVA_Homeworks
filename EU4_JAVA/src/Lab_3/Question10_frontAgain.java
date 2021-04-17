package Lab_3;

public class Question10_frontAgain {

	public static void main(String[] args) {

		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));		
		System.out.println(frontAgain("inc"));
		
		
		
	}public static boolean frontAgain(String str) {
	
		if (str.charAt(0)==str.charAt(str.length()-2)&&str.charAt(1)==str.charAt(str.length()-1)) {
			return true;
			
		}else {
			return false;}
		
		
		/*
		 * String first2=str.substring(0,2);
		 * String last2=str.substring(str.length()-2);
		 * 
		 * return first2.equals(last2);		 */
		
	}

}
