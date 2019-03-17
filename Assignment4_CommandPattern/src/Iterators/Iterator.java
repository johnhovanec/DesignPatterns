package Iterators;

public interface Iterator {
	// returns true if items of appropriate type left in list 
	boolean hasNext();
	
	// returns current item and advances to next item
	Object next();
}