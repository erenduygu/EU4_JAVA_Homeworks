package repl_it_tasks.from150to200;

public class Task175_ValidateTask {

	public static void main(String[] args) {
	}

	public boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

		if (!isAvailable) {

			return false;
		}
		if (year != 2018) {
			return false;
		}
		if (month == 7 && day >= 1 && day <= 8) {
			return false;
		}

		return true;

	}
}