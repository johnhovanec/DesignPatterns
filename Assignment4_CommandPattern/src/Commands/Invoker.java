package Commands;

import Aggregator.*;

public class Invoker {
    private static Aggregator agg = new Aggregator();
    
    
    public static Menu getMenu(){
        return (Menu) new CMDGetMenu(agg).execute();
    }


	public static Tab getTab() {
		return (Tab) new CMDGetTab(agg).execute();
	}
    
    public static Orders submitOrder(int itemNumber){
    	OrderItem item = new OrderItem(itemNumber);
    	//Orders newOrder = new Orders();
    	//newOrder.addItem(item);
        return (Orders) new CMDSubmitOrder(agg, item).execute();
    }
    
}
