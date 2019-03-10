/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicrestaurantsystem;
import java.util.Scanner;

import Aggregator.Aggregator;
import SystemInterface.SystemInterface;

public class BasicRestaurantSystem {
	
    public static void main(String[] args) {
    	
        Aggregator aggregator = new Aggregator();
        SystemInterface systemInterface = new SystemInterface();
        
        System.out.println("Welcome to the Basic Restaurant System");
        System.out.printf("Please choose from the following options:\n"
        		+ "1. Display Menu\n"
        		+ "2. Submit Order\n"
        		+ "3. Display Tab\n"
        		+ "\n"
        		+ "Enter the number of your selection and then press Enter. To exit, press X.");
        
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();
        
		switch (readLine) {
		case "1":
			// Display Menu
			String[] menuItems = SystemInterface.getMenu();
			for (String item : menuItems) { 
			    System.out.println(item);
			}
			break;
		case "2":
			// Submit Order
			break;
		case "3":
			// Display Tab
			break;
		case "X":
			System.out.println("Goodbye");
			break;
		default:
			break;
		}
	}
}
