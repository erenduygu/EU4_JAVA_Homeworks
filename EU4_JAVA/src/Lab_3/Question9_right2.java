package Lab_3;

public class Question9_right2 {

	public static void main(String[] args) {


		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));
		System.out.println(right2("Handkercief"));
		
		
		
	}public static String right2(String str) {
		
		if (str.length()<=2) {
			return str;
		}else {
			
			return str.substring(str.length()-2,str.length()).concat(str.substring(0,str.length()-2));
		}
		
	}

}
