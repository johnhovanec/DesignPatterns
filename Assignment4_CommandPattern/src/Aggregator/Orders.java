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
}
