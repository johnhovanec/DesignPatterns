package Commands;

import Aggregator.*;

public class CMDSubmitOrder implements Command {

	private Aggregator agg;
	private Integer itemNum;
	private OrderItem item;
	private Orders order;
	
	public CMDSubmitOrder(Aggregator agg, OrderItem item){
        this.agg = agg;
        //this.order = order;
        this.item = item;
    }
	

	public Object execute(){
	    return new Orders(agg.submitOrder(item)); // if copy constructor implemented
	    // or
	    // return agg.getMenu().clone(); // if clone method implemented 
    }

}
