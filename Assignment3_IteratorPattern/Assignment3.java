package COSC716_Assignment3_IteratorPattern;

import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Menu eatAtJoesMenu = new Menu();
		
		eatAtJoesMenu.add("Lobster", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, 24.99);
		eatAtJoesMenu.add("Rice Pudding", Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 3.50);
		eatAtJoesMenu.add("Creme Caramel", Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 7.25);
		eatAtJoesMenu.add("Garden Salad", Menu.APPETIZERS, Menu.HEART_HEALTHY, 6.95);
		eatAtJoesMenu.add("Egg Rolls", Menu.APPETIZERS, Menu.NOT_HEART_HEALTHY, 3.75);
		eatAtJoesMenu.add("Fish Tacos", Menu.MAIN_DISH, Menu.HEART_HEALTHY, 17.55);
		
		// 1 – Display all menu items
		MenuItem item;
		MenuIterator itr = eatAtJoesMenu.getAllItemsIterator();
		System.out.println("ALL MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 2 – Display all appetizers
		itr = eatAtJoesMenu.getItemIterator(Menu.APPETIZERS);
		System.out.println("ALL APPETIZER MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 3 – Display all main dishes
		itr = eatAtJoesMenu.getItemIterator(Menu.MAIN_DISH);
		System.out.println("ALL MAIN DISH MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 4 – Display all desserts
		itr = eatAtJoesMenu.getItemIterator(Menu.DESSERT);
		System.out.println("ALL DESSERT MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 5 – Display all hearty healthy items
		itr = eatAtJoesMenu.getHeartHealthyIterator();
		System.out.println("ALL HEART HEALTHY MENU ITEMS"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
				
		// 6 – Display all main dishes under a specified price
		itr = eatAtJoesMenu.getPriceIterator(15.00);
		System.out.println("ALL MENU ITEMS UNDER $15.00:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 7 – Add menu item
		System.out.println("ADDING NEW ITEM TO MENU\n");
		eatAtJoesMenu.add("Tomato Soup", Menu.APPETIZERS, Menu.HEART_HEALTHY, 4.15);
		
		// Display all menu items to check item was added
		itr = eatAtJoesMenu.getAllItemsIterator();
		System.out.println("ALL UPDATED MENU ITEMS:"); 
		while (itr.hasNext()) {
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
		}
		System.out.println();
		
		// 8 – Remove menu item
		Scanner readInput = new Scanner(System.in);
		char key;
		System.out.println("REMOVING ITEM FROM MENU\n");
		itr = eatAtJoesMenu.getAllItemsIterator();
		
		while (itr.hasNext()) {
			System.out.println("ITERATING THOUGH ALL ITEMS. PRESS \"d\" TO DELETE ITEM"); 
			item = itr.next();
			System.out.println(item.getName() + " $" + item.getPrice());
			System.out.println("Press d to delete this item, or press return to continue.");
			
			try {
				char c = (char) System.in.read();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
