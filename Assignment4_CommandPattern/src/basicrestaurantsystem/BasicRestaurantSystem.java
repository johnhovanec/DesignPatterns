/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicrestaurantsystem;

	import java.util.Scanner;

import Aggregator.*;
import SystemInterface.SystemInterface;
import Iterators.Iterator;
import Iterators.MenuIterator;;

public class BasicRestaurantSystem {

	public static void main(String[] args) {

		Aggregator aggregator = new Aggregator();
		SystemInterface systemInterface = new SystemInterface();
		Scanner scanner = new Scanner(System.in);
		String readLine = "";

		while (!readLine.equalsIgnoreCase("X")) {
			System.out.println("\n----- Welcome to the Basic Restaurant System -----\n");
			System.out.printf("Please choose from the following options:\n" + "1. Display Menu\n" + "2. Submit Order\n"
					+ "3. Display Tab\n" + "\n"
					+ "Enter the number of your selection and then press Enter. To exit, press X.");

			readLine = scanner.nextLine();
			switch (readLine) {
			case "1":
				// Display Menu
				displayMenu();
				break;
			case "2":
				// Submit Order
				System.out.println("Please choose a main dish to order.\n");
				displayMenu();
				System.out.println("Enter the number to order and then press Enter. To exit, press X");
				readLine = scanner.nextLine();
				if (readLine.equalsIgnoreCase("X")) {
					break;
				}
				int orderItem = Integer.parseInt(readLine);
				String orderResponse = SystemInterface.submitOrder(orderItem);
				System.out.println(orderResponse);
				break;
			case "3":
				// Display Tab
				System.out.printf("\n------- Your Tab -------\n");
				String[] tabItems = SystemInterface.getTab();
//    			for (String item : tabItems) { 
//    			    System.out.println(item);
//    			}
				System.out.printf("\n------------------------\n");
				break;
			case "X":

				break;
			default:
				break;
			}
		}
		System.out.println("Goodbye");

	}

	public static void displayMenu() {
		System.out.printf("\n----------------    Our Menu    ----------------\n");

		Menu menu = SystemInterface.getMenu();
		Iterator menuIterator = menu.createIterator();
		MenuItem item;
		while (menuIterator.hasNext()) {
			item = (MenuItem) menuIterator.next();
			System.out.println(item.getItemNum() + "\t" + item.getDescription() + " $" + item.getPrice());
		}

		System.out.printf("\n--------------------------------------------------\n\n");
	}
}
