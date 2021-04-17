package Assignment_14_OOP;

public class Atts {

	public static void main(String[] args) {

		Atts a = new Atts();
		a.name = "table";
		a.color = "brown";
		a.amount = 1;

		System.out.println(a.asString());
	}

	public String name, color;
	public int amount;

	public String asString() {

		return "name:" + name + " color:" + color + " amount:" + amount;

	}

}
