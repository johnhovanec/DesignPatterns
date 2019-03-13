package Aggregator;

public class Orders {
    private OrderItem[] order_items;
    private int current;
    
    public Orders() {
    	order_items = new OrderItem[10];
    }
    
    public Orders(Orders otherOrder) {
    	order_items = new OrderItem[10];
    	System.arraycopy(otherOrder.order_items, 0, order_items, 0, 
    			order_items.length);
    }
    
    public Orders(OrderItem orderItem) {
    	order_items = new OrderItem[10];
    	order_items[0] = orderItem;
    	//System.arraycopy(otherOrder.order_items, 0, order_items, 0, order_items.length);
    }
    
    public void addItem(OrderItem item){
        order_items[findAvailIndex()] = item;
    }
    
    protected OrderItem[] getOrderItems() {
    	return this.order_items;
    }
    
    
    public int getLength(Orders order){
        int count = 0;
        for(int i = 0; i < order_items.length; i++) {
        	if (order_items[i] != null)
        		count++;
        }
        return count;
    }
    
    // private methods
    private int findAvailIndex(){
        int i = 0;
        while(order_items[i] != null)
            i++;
        
        return i;
    }
}
