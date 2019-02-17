package COSC716_Assignment3_IteratorPattern;

public class MenuItem {
	
	public MenuItem(String name, int category, boolean healthy, double price) {
		this.name = name;
		this.category = category;
		this.healthy = healthy;
		this.price = price;
	}
	
	String name;
	int category;
	boolean healthy;
	double price;
	
	public String getName() {
		return name;
	}
	
	public String getPrice() {
		return Double.toString(price);
	}
}

