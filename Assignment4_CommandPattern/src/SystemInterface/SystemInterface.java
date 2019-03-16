package SystemInterface;

import Aggregator.*;
import Commands.Invoker;
import java.util.ArrayList;

public class SystemInterface {
    
    public static String[] getMenu(){
        Menu menu = Invoker.getMenu();
        
        ArrayList<String> displayLines = new ArrayList<>();
        
        menu.reset();
        while(menu.hasNext()){
            displayLines.add(menu.getNextItem().toString());
        }
        
        return (String[]) displayLines.toArray(new String[displayLines.size()]);
    }
    
    public static String[] submitOrder(int orderItem) {
    	Orders orders = Invoker.submitOrder(orderItem);
    	ArrayList<String> displayLines = new ArrayList<>();
    	return (String[]) displayLines.toArray();
    }
    
    public static String[] getTab() {
    	Tab	tab = Invoker.getTab();
    	ArrayList<String> displayLines = new ArrayList<>();
    	
    	tab.reset();
        while(tab.hasNext()){
            displayLines.add(tab.getNextItem().toString());
        }
        displayLines.add(tab.getNextItem().toString());
        
        // The tab total is appended to the end of the list
    	displayLines.add("Total: $" + String.valueOf(tab.getTotal()));
    	
    	return (String[]) displayLines.toArray(new String[0]);
    }
}


