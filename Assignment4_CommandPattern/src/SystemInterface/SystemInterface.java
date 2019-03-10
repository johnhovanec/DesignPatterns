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
    
    public static String[] submitOrder() {
    	ArrayList<String> displayLines = new ArrayList<>();
    	return (String[]) displayLines.toArray();
    }
    
    public static String[] getTab() {
    	ArrayList<String> displayLines = new ArrayList<>();
    	return (String[]) displayLines.toArray();
    }
}


