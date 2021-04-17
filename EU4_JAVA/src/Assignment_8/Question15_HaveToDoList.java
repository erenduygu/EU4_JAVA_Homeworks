package Assignment_8;

public class Question15_HaveToDoList {

	public static void main(String[] args) {

		System.out.println(validateTask(true, 2, 1));
	}

	public static boolean validateTask(boolean b1, int nextID, int currentID) {

		if (b1 == true && nextID == currentID + 1)
			return true;
		return false;

	}

}
