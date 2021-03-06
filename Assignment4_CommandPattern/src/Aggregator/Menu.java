package Aggregator;

import Iterators.Iterator;
import Iterators.MenuIterator;

public class Menu {
    private MenuItem[] menu_items;
    private int current;
    
    public Menu(){
        menu_items = new MenuItem[10];
        initMenu();
    }
    
    public Menu(Menu otherMenu){
    	menu_items = new MenuItem[10];		// copy constructor
        System.arraycopy(otherMenu.menu_items, 0, menu_items, 0, 
                         menu_items.length);
    }
    
    public void addItem(MenuItem item){
        menu_items[findAvailIndex()] = item;
    }
    
    public void reset(){
        current = 0;
    }
    
    public boolean hasNext(){
        if(current == menu_items.length)
            return false;
        
        if(current == menu_items.length - 1)
        	return menu_items[current] != null;
        
        return menu_items[current + 1] != null;
    }
    
    public MenuItem getNextItem(){
        return menu_items[current++];
    }
    
    public int getLength() {
    	return menu_items.length;
    }
    
    protected MenuItem getOrderItem(int itemNumber) {
    	return menu_items[itemNumber - 1];
    }
    
    public Iterator createIterator() {
    	return new MenuIterator(menu_items);
    }
    
    // --- private methods
    private void initMenu(){
        for(int i = 0; i < menu_items.length; i++)
            menu_items[i] = null;
    }
    
    private int findAvailIndex(){
        int i = 0;
        while(menu_items[i] != null)
            i++;
        
        return i;
    }
    
}
