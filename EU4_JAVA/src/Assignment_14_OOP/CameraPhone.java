package Assignment_14_OOP;

public class CameraPhone extends Phone{
	int imageSize;
	int memorySize;
	
	public CameraPhone(int imageSize, int memorySize) {
		super();
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return memorySize*1000/imageSize;
		
	}
	
	public static void main(String[] args) {
		CameraPhone cp= new CameraPhone(4, 5);
		System.out.println(cp.numPictures());
	}

}
