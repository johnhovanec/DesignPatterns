package COSC716_Assignment3_IteratorPattern;

public class Assignment3 {

	public static void main(String[] args) {
		Menu eatAtJoesMenu = new Menu();
		
		eatAtJoesMenu.add("Lobster", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, 24.99);
		eatAtJoesMenu.add("Rice Pudding", Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 3.50);
		eatAtJoesMenu.add("Creme Caramel", Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 7.25);
		eatAtJoesMenu.add("Garden Salad", Menu.APPETIZERS, Menu.HEART_HEALTHY, 6.95);
		eatAtJoesMenu.add("Egg Rolls", Menu.APPETIZERS, Menu.NOT_HEART_HEALTHY, 3.75);
		eatAtJoesMenu.add("Fish Tacos", Menu.MAIN_DISH, Menu.HEART_HEALTHY, 17.55);
		
		// All items
		MenuItem item;
		MenuIterator itr = eatAtJoesMenu.getAllItemsIterator();
		System.out.println("ALL MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// Items by type
		itr = eatAtJoesMenu.getItemIterator(Menu.DESSERT);
		System.out.println("ALL DESSERT MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// Items by price
		itr = eatAtJoesMenu.getPriceIterator(15.00);
		System.out.println("ALL MENU ITEMS UNDER $15.00:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
	}
}
