package bestbuyreceiptsystem;

import abstractClasses.Decorator;
import interfaces.AddOn;
import interfaces.Receipt;

public class PostDecorator extends Decorator {
	private AddOn a; // ?? a guess on these
	private Receipt r;

	public PostDecorator(Receipt r, AddOn a) {
		super(r, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prtReceipt() {
		// TODO Auto-generated method stub
		callTrailer();
		System.out.println(a.getLines());
	}
}
