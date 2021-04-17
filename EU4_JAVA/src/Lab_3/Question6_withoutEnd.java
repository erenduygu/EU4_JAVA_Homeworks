package Lab_3;

public class Question6_withoutEnd {

	public static void main(String[] args) {

		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("cybertek"));
		System.out.println(withoutEnd("He"));


		
	}public static String withoutEnd(String str) {
		
		if (str.length()>2) {
			str= str.substring(1, str.length()-1);
			return str;
		}else {
			return "nothing";}
	}

}
