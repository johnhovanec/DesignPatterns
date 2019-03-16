package Commands;

import Aggregator.*;

public class CMDSubmitOrder implements Command {

	private Aggregator agg;
	private Integer itemNum;
	private Orders order;
	
	public CMDSubmitOrder(Aggregator agg, Orders order){
        this.agg = agg;
        this.order = order;
    }
	

	public Object execute(){
	    return new Orders(agg.submitOrder()); // if copy constructor implemented
	    // or
	    // return agg.getMenu().clone(); // if clone method implemented 
    }

}
