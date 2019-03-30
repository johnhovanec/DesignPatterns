package bestbuyreceiptsystem;

public class StoreItem {
	private String itemCode; // e.g., 3010
	private String itemDescription; // e.g., Dell Laptop
	private String itemPrice;

	public StoreItem(String code, String description, String price) {
		itemCode = code;
		itemDescription = description;
		itemPrice = price;
	}

	// appropriate getters and setters
}
