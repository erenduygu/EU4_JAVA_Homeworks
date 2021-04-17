package assignment_3;

public class Question5_TimeConversion {

	public static void main(String[] args) {

	int inputSeconds, hours, minutes, seconds;
	
	inputSeconds=3695;
	
	hours= inputSeconds/3600;
	
	minutes= (inputSeconds%3600)/60;
	
	seconds= ((inputSeconds%3600)%60)%60;
	
	
	System.out.println("inputSecond is "+ inputSeconds);
	System.out.println(hours+ " hours," + minutes + " minutes, and " + seconds + " seconds");
		

	}

}
