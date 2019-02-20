package COSC716_Assignment3_IteratorPattern;

public interface MenuIterator {
	// returns true if items of appropriate type left in list 
	public boolean hasNext();
	
	// returns current item and advances to next item
	public MenuItem next();
	
	public MenuItem remove();
}
