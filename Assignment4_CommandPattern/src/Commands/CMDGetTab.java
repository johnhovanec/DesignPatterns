package Commands;

import Aggregator.*;

public class CMDGetTab implements Command{

	private Aggregator agg;

	public CMDGetTab(Aggregator agg){
        this.agg = agg;
    }

	public Object execute() {
		return new Tab(agg.getTab());
	}

}
