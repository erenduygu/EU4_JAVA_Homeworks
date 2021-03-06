package Assignment_14_OOP;

public class Item {

	private String name;
	private int catalogNumber;
	private int quantity;
	private double price;

	public Item(String name, int quantity, int catalogNumber, double price) {
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {

		return price;
	}

	public String getName() {

		return name;
	}

	public int getQuantity() {

		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

	public int getCatalogNumber() {
		// TODO
		return catalogNumber;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;

	}

	@Override
	public String toString() {
		return "Regular Item{name=" + name + ", catalogNumber= " + catalogNumber + ", quantity= " + quantity
				+ ", price=" + price + "}";
	}

}