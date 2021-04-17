package Assignment_14_OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TJMaxx {

	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;

	public TJMaxx() {
		regularItems = new ArrayList<>();
		onSaleItems = new ArrayList<>();

	}

	public void addRegularItem(Item item) {

		regularItems.add(item);
	}

	public void addOnSaleItem(OnSaleItem item) {

		onSaleItems.add(item);

	}

	public List<Item> getRegularItems() {

		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() {

		return onSaleItems;
	}

	/**
	 * return count of regularItem object
	 * 
	 * @return
	 */
	public int regularItemsCount() {

		return regularItems.size();
	}

	public int onSaleItemsCount() {

		return onSaleItems.size();
	}

	/**
	 * returns the name of each item in TJ Maxx starting from regular item then
	 * onSaleItems
	 * 
	 * @return
	 */
	public List<String> getAllItemNames() {

		List<String> allName = new ArrayList<>();

		for (int i = 0; i < regularItems.size(); i++) {
			allName.add(regularItems.get(i).getName());
		}
		for (int i = 0; i < onSaleItems.size(); i++) {
			allName.add(onSaleItems.get(i).getName());
		}

		return allName;
	}

	/**
	 * gets catalog number and returns price for the item it will search for the
	 * item both regularItems and onsaleonSaleItems
	 * 
	 * @param catalogNumber
	 * @returns 0.0 if product cannot be found with that catalognumber
	 */
	public double getItemPrice(int catalogNumber) {

		for (int i = 0; i < regularItems.size(); i++) {
			if (regularItems.get(i).getCatalogNumber() == catalogNumber)
				return regularItems.get(i).getPrice();
		}

		for (int i = 0; i < onSaleItems.size(); i++) {
			if (onSaleItems.get(i).getCatalogNumber() == catalogNumber)
				return onSaleItems.get(i).getPrice();
		}
		return 0.0;
	}

	/**
	 * accepts a name then searches amoung onSaleItems. Once it finds, the method
	 * will return that OnSaleItem object
	 * 
	 * @param name
	 * @return
	 */
	public OnSaleItem getOnSaleItem(String name) {

		for (int i = 0; i < onSaleItems.size(); i++) {
			if (onSaleItems.get(i).getName().contains(name))
				return onSaleItems.get(i);
		}

		return null;
	}

	/**
	 * removes the item with matching catalogNumber from both regularItems and
	 * onSaleItems. Does nothing if not found
	 * 
	 * @param catalogNumber
	 */
	public void removeItem(int catalogNumber) {

		 regularItems.removeIf(p -> p.getCatalogNumber()==catalogNumber);

		/*for (int i = 0; i < regularItems.size(); i++) {
			if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
				regularItems.remove(i);
				i--;
			}

		}
		*/

		 onSaleItems.removeIf(p -> p.getCatalogNumber()==catalogNumber);

		/*
		 for (int i = 0; i < onSaleItems.size(); i++) {
		 
			if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {

				onSaleItems.remove(i);
				i--;
			}
		}
		 */

	}

	/**
	 * - it accepts a catalog number and finds that item among regularItems and
	 * onSaleItems - if it finds the item: - decrease the count of the Item by 1 -
	 * if count reaches 0 after decrementing then remove the product(call removeItem
	 * method)
	 *
	 * @param catalogNumber
	 */
	public void buyItem(int catalogNumber) {

		for (int i = 0; i < regularItems.size(); i++) {

			int x = regularItems.get(i).getQuantity();

			if (regularItems.get(i).getCatalogNumber() == catalogNumber) {

				regularItems.get(i).setQuantity(x - 1);
			}

			if (x == 0) {
				removeItem(catalogNumber);
			}

		}

		for (int i = 0; i < onSaleItems.size(); i++) {
			int x = onSaleItems.get(i).getQuantity();

			if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {

				onSaleItems.get(i).setQuantity(x - 1);
			}

			if (x == 0) {
				removeItem(catalogNumber);
			}

		}
	}

}