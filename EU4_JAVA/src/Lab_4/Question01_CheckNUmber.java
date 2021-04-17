package Lab_4;

public class Question01_CheckNUmber {

	public static void main(String[] args) {

		int[] x = {1,2,6};
		int[] y = {6,1,2,3};	
		int[] z = {13,6,1,2,3};
		
		System.out.println(checkSix(x));
		System.out.println(checkSix(y));
		System.out.println(checkSix(z));
		
	}public static boolean checkSix(int [] arr) {
	
		if(arr.length<1) {
			return false;
		}
				if (arr[0]==6||arr[(arr.length-1)]==6) {
				return true;
			}
		
		return false;
		
	}

}
