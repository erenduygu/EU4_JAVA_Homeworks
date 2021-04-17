package repl_it_tasks.from150to200;

public class Task177_Methods_GetThunderBluzz {

	public static void main(String[] args) {
	}
	public boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {
		if (!available && !gift) {
			if (!(ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
					|| !(ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)) {

				return false;
			} else {
				return true;
			}

		}	return true;

	}
}
