package COSC716_Assignment3_IteratorPattern;

import java.util.ArrayList;

public class Menu {
	
	public static final int APPETIZERS = 1; 
	public static final int MAIN_DISH = 2; 
	public static final int DESSERT = 3;
	public static final boolean HEART_HEALTHY = true; 
	public static final boolean NOT_HEART_HEALTHY = false;
	
	ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	 
	public void add(String name, int category, boolean healthy, double price) {
		MenuItem item = new MenuItem(name, category, healthy, price);
		menuItems.add(item);
	}
}
