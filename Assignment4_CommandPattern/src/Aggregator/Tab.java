package Aggregator;

public class Tab {
	private MenuItem[] tab_menu_items;
	private double total;
	
	public double setTotal(Double price) {
		total = total + price;
		return total;
	}
}
