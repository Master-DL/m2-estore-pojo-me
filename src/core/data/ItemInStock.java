package core.data;

import core.services.Provider;
import core.services.interfaces.ProviderInterface;

public class ItemInStock {

	/** The total number of ItemInStock instances created. */
	private static int numItems;

	/** The index of this item. */
	private int num;

	private Object item;
	private int quantity;
	private double price;
	private ProviderInterface provider;

	private ItemInStock() {
		num = numItems++;
	}

	public ItemInStock(Object item, int quantity, double price, ProviderInterface provider) {
        this();
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		this.provider = provider;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void changeQuantity(int qtyToAddOrRemove) {
		if ((qtyToAddOrRemove >= 0 ) || (quantity >= -qtyToAddOrRemove)) {
			quantity += qtyToAddOrRemove ;
		}
	}

	@Override
	public String toString() {
		return "ItemInStock [num=" + num + ", item=" + item + ", quantity=" + quantity + ", price=" + price
				+ ", provider=" + provider + "]";
	}


}
