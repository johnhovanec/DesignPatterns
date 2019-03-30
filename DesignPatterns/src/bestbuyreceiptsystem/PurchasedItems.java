package bestbuyreceiptsystem;

import java.util.ArrayList;

public class PurchasedItems {
	private ArrayList<StoreItem> items;

	public PurchasedItems() {
		items = new ArrayList();
	}

	public void addItem(StoreItem item) {
		// ...
	}

	public double getTotalCost() {
		// ...
		return 0.00;
	}

	public boolean containsItem(String itemCode) {
		// ...
		return false;
	}
}
