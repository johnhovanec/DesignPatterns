package Commands;

import Aggregator.*;

public class CMDSubmitOrder implements Command{

	private Aggregator agg;

	public CMDSubmitOrder(Aggregator agg){
        this.agg = agg;
    }
	
	public Object execute(){
	    return new Orders(agg.submitOrder()); // if copy constructor implemented
	    // or
	    // return agg.getMenu().clone(); // if clone method implemented 
    }

}
