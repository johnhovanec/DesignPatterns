package Commands;

import Aggregator.*;

public class CMDGetMenu {
    
    private Aggregator agg;
    
    public CMDGetMenu(Aggregator agg){
        this.agg = agg;
    }
    
    public Object execute(){
    return new Menu(agg.getMenu()); // if copy constructor implemented
    // or
    // return agg.getMenu().clone(); // if clone method implemented 
    }
    
}
