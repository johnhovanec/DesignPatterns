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
	
	public String getItemCode() {
		return itemCode;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}
	
	public String getItemPrice() {
		return itemPrice;
	}
	// appropriate getters and setters
}
