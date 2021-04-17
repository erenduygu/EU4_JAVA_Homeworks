package repl_it_tasks.from200to250;

public class Task225_TVMain {

	public static void main(String[] args) {

		 TV tv=new TV();
			
			System.out.println(tv.getChannel());
			System.out.println(tv.getBrand());
			System.out.println( tv.getVolumeLevel());
			System.out.println(tv.getChannel());
			System.out.println(tv.getBrand());
			System.out.println( tv.getVolumeLevel());
			System.out.println("------------------------------------------");
		
		 TV tv1=new TV("Sony");
			

			tv1.setVolumeLevel(70);
			System.out.println( tv1.getVolumeLevel());
			tv1.setChannel(122);
			System.out.println( tv1.getChannel());
			
		}
	

}
