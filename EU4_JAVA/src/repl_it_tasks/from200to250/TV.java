package repl_it_tasks.from200to250;

public class TV {

	int channel=1;
	  int volumeLevel=1;
	  boolean on = false; 
	  String brand = "undefined" ;
	  
	  public TV(){
	    System.out.println("Creating TV object using no Args- constructor");
	    
	  }
	   public TV(String brand){

	    this.brand=brand;
	    System.out.println("Creating TV object using 1 arg - constructor");
	  }
	  public int getChannel(){
	    return channel;
	  }
	  public void setChannel(int newChannel){
	     if (on && newChannel >= 1 && newChannel <= 120) {
	            this.channel = newChannel;
	        } else {
	            System.out.println("ERROR: TV is either OFF or invalid Channel");
	        }
	  }
	  public int getVolumeLevel() {
			return volumeLevel;
		}
	  public void setVolumeLevel(int newVolumeLevel) {
	        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
	            this.volumeLevel = newVolumeLevel;
	        } else {
	            System.out.println("ERROR: TV is either OFF or invalid Volume level");
	        }

		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void channelUp(){
		  if (on && channel < 120) {
	            channel++;
	        }

		}
		public void channelDown(){
		    if (on && channel > 1) {
	            channel--;
	        }

		}
		public boolean isOn() {
			return on;
		}
			public void volumeUp(){
		   if (on && volumeLevel < 7) {
	            volumeLevel++;
	        }

		}
		public void volumeDown(){
		   if (on && volumeLevel > 1) {
	            volumeLevel--;
	        }

		}
		public void turnOn(){
		  if (on==true){
		    System.out.println("TV is already ON");
		  } else {
	            on = true;
	        }
		}
		public void turnOff(){
		  if (on==false){
		    System.out.println("TV is already OFF");
		  }else {
	            on = false;
	        }

		}
	  
	}