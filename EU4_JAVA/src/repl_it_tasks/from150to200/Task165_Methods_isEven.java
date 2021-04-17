package repl_it_tasks.from150to200;

public class Task165_Methods_isEven {

	public static void main(String[] args) {

		isEven(1);
		
		System.out.println(isEven(8));
	}
	public static boolean isEven(int n) {
		
		if (n%2==0){
			return true ;
		}else {return false;}
    
  }
}


