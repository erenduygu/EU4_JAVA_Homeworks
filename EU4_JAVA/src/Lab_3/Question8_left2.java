package Lab_3;

public class Question8_left2 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		System.out.println(left2("Handkercief"));
		
		
		
	}public static String left2(String str) {
		
		if (str.length()<=2) {
			return str;
		}else {
			
			return str.substring(2).concat(str.substring(0,2));
		}
		
	}

}
