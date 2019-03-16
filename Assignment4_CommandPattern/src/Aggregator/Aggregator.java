package Aggregator;

public class Aggregator {
    
    private Menu menu;
    private Orders orders;
    private Tab tab;
    
    public Aggregator(){
        menu = new Menu();
        populateMenu();
        
        orders = new Orders();
        //populateOrders();
        
        tab = new Tab();
        
    }

	public Menu getMenu(){
        return menu;
    }
    
    public Orders getOrders(){
        return orders;
    }
    
	public Orders submitOrder(Orders order) {
		this.orders = order;
		return orders;
	}
	
	public Tab getTab() {
        tab = calculateTab();
        return tab;
	}
    
    // --- private methods
    
    private void populateMenu(){
        menu.addItem(new MenuItem(1, "Roast Beef", 12.50));
        menu.addItem(new MenuItem(2, "Turkey Dinner", 9.50));
        menu.addItem(new MenuItem(3, "Meatloaf", 14.75));
        menu.addItem(new MenuItem(4, "Aloo Gobi", 10.20));
        menu.addItem(new MenuItem(5, "Chicken Vindaloo", 13.70));
        menu.addItem(new MenuItem(6, "Mali Kofta", 14.50));
        menu.addItem(new MenuItem(7, "Sushi Platter", 17.65));
        menu.addItem(new MenuItem(8, "Bibimbap", 12.40));
        menu.addItem(new MenuItem(9, "Kalbi", 19.80));
        menu.addItem(new MenuItem(10, "Chap Chae", 11.80));
    }
    
    private Tab calculateTab() {
    	OrderItem item = orders.getOrderItem();
    	
    		if (item!= null) {
    		    int itemNumber = item.getItemNum();
    		    MenuItem menuItem = menu.getOrderItem(itemNumber);
    		    
    		    tab.addItem(menuItem); /// menuItem.getDescription() + "\t" + menuItem.getPrice();
    		    tab.setTotal(menuItem.getPrice()); //= subtotal + menuItem.getPrice();	    
    		}
		    
		return tab;
	}
}
