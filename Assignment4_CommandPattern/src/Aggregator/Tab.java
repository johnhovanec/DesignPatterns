package Aggregator;

public class Tab {
	private MenuItem[] tab_items;
	private int current;
	private double total = 0;
	
	public Tab() {
		tab_items = new MenuItem[10];
	}
	
	public Tab(Tab otherTab) {
		tab_items = new MenuItem[10];
		//total = otherTab.total;						// copy constructor
        System.arraycopy(otherTab.tab_items, 0, tab_items, 0, 
        		tab_items.length);
        
	}

	public void reset(){
        current = 0;
    }
	
	public boolean hasNext(){
        if(current == tab_items.length)
            return false;
        
        if(current == tab_items.length - 1)
        	return tab_items[current] != null;
        
        return tab_items[current + 1] != null;
    }
	
	public MenuItem getNextItem(){
        return tab_items[current++];
    }
	
	public void setTotal(Double price) {
		total = total + price;
		//return total;
	}
	
	public void addItem(MenuItem item){
        tab_items[findAvailIndex()] = item;
    }
	
	private int findAvailIndex(){
        int i = 0;
        while(tab_items[i] != null)
            i++;
        
        return i;
    }
}
