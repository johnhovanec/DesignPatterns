package Iterators;

import Aggregator.*;

public class MenuIterator implements Iterator{

	private Object[] items;
	private int current = 0;
	
	public MenuIterator(Object[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if ( current >= items.length || items[current] == null)
			return false;
		else
			return true;          
	}

	@Override
	public Object next() {
		Object item = items[current];
		current = current + 1;
		return item;
	}

}
