package assignment5;

import java.util.Date;

public class BasicReceipt implements Receipt {
	private StoreHeader store_header; // street address, state code, phone number, store number
	private TaxComputationMethod tc;
	private Date date; // may also be a String type
	private PurchasedItems items;

	public BasicReceipt(PurchasedItems items, Date date) { // Date may also be a String type
		this.items = items;
	}

	public void setStoreHeader(StoreHeader h) {
		store_header = h;
	}

	public void setTaxComputationMethod(TaxComputationMethod tc) {
		this.tc = tc;
	}

	public void prtReceipt() {
// to implement 
	}
}
