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
        Scanner scanner = new Scanner(System.in);
        String readLine = "";
        
        while(!readLine.equalsIgnoreCase("X")) {
        	System.out.println("\n----- Welcome to the Basic Restaurant System -----\n");
            System.out.printf("Please choose from the following options:\n"
            		+ "1. Display Menu\n"
            		+ "2. Submit Order\n"
            		+ "3. Display Tab\n"
            		+ "\n"
            		+ "Enter the number of your selection and then press Enter. To exit, press X.");
            
            readLine = scanner.nextLine();
    		switch (readLine) {
    		case "1":
    			// Display Menu
    			System.out.printf("\n------- Our Menu -------\n");
    			String[] menuItems = SystemInterface.getMenu();
    			for (String item : menuItems) { 
    			    System.out.println(item);
    			}
    			System.out.printf("\n------------------------\n");
    			break;
    		case "2":
    			// Submit Order
    			System.out.println("Please choose a main dish to order.");
    			menuItems = SystemInterface.getMenu();
    			for (String item : menuItems) { 
    			    System.out.println(item);
    			}
    			
    			System.out.println("Enter the number to order and then press Enter. To exit, press X");
    			readLine = scanner.nextLine();
    			if(readLine.equalsIgnoreCase("X")) {
    				break;
    			}
    			//int orderItem = Integer.parseInt(readLine);
    			//String[] orderResponse = SystemInterface.submitOrder(orderItem);
//    			for (String item : orderResponse) { 
//    			    System.out.println(item);
//    			}
    			break;
    		case "3":
    			// Display Tab
    			System.out.printf("\n------- Your Tab -------\n");
    			String[] tabItems = SystemInterface.getMenu();
    			for (String item : tabItems) { 
    			    System.out.println(item);
    			}
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
}
