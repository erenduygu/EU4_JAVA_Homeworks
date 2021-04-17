package Assignment_14_OOP;

public class OnSaleItem extends Item {

	private double discount;

	public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
		super(name, quantity, catalogNumber, price-discount/100*price);
		this.discount = discount;

	}

	public double getDiscount() {
		// TODO
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;

	}

	@Override
	public String toString() {
		return "OnSaleItem{discount=" + discount + "%, name=" + getName() + ", price= " + getPrice() + "}";
	}
}