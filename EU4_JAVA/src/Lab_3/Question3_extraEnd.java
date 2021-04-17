package Lab_3;


public class Question3_extraEnd {

	public static void main(String[] args) {

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("Hi"));
		System.out.println(extraEnd("I am Java"));

	}

	public static String extraEnd(String org) {


		if (org.length() < 2) {

			return "Invalid String";

		}else  {

			String last2=org.substring(org.length()-2);
			return last2+last2+last2;
		}

	}

}
