package Lab_3;

public class Question7_comboString {

	public static void main(String[] args) {

		System.out.println(comboString("Hello","Hi"));
		System.out.println(comboString("Hi","Hello"));
		System.out.println(comboString("aaa","bb"));
		System.out.println(comboString("ccc","ddd"));

		
	}public static String comboString(String str1,String str2) {
		
		if (str1.length()>str2.length()) {
			return str2+str1+str2;
		}else {
			return str1+str2+str1;
		}
	}

}
