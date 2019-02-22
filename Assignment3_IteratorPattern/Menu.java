package COSC716_Assignment3_IteratorPattern;

import java.util.NoSuchElementException;
import java.util.Vector;

public class Menu {
	
	public static final int APPETIZERS = 1; 
	public static final int MAIN_DISH = 2; 
	public static final int DESSERT = 3;
	public static final boolean HEART_HEALTHY = true; 
	public static final boolean NOT_HEART_HEALTHY = false;
	
	Vector<MenuItem> menuItems = new Vector<MenuItem>();
	
	public MenuIterator getAllItemsIterator() {
		return new AllItemsIterator(this); 
	}
	
	public MenuIterator getItemIterator(int type) {
		return new ItemIterator(this, type); 
	}
	
	public MenuIterator getPriceIterator(double price) {
		return new PriceIterator(this, price); 
	}
	
	public MenuIterator getHeartHealthyIterator() {
		return new HeartHealthyIterator(this); 
	}
	 
	public void add(MenuItem item) {
		menuItems.add(item);
	}
	
	public void delete(MenuIterator itr) {
		MenuItem item = itr.remove();
		System.out.println("Deleting "  + item.name + " at index " + menuItems.indexOf(item) + "\n");
		menuItems.remove(menuItems.indexOf(item));
	}

	private class AllItemsIterator implements MenuIterator {
		
		private Menu menu;
		private int current;
		
		public AllItemsIterator(Menu menu) {
			this.menu = menu;
		}
		
		@Override
		public boolean hasNext() {
			return current < menu.menuItems.size();
		}

		@Override
		public MenuItem next() {
			return menu.menuItems.get(current++);
		}

		@Override
		public MenuItem remove() {
			int numberOfItems = menu.menuItems.size();
			if (current < numberOfItems) {
				int removeIndex = current - 1;
				current--;
				return menu.menuItems.get(removeIndex);
			}
			else if (current == numberOfItems) {
				current = numberOfItems - 1;
				return menu.menuItems.get(current);
			}
			else
				return menu.menuItems.get(0);
		}		
	}
	
	private class ItemIterator implements MenuIterator {
			
			private Menu menu;
			private int type;
			MenuItem nextCandidate;
			int index = 0;
			
			public ItemIterator(Menu menu, int type) {
				this.menu = menu;
				this.type = type;
			}
			
			@Override
			public boolean hasNext() {
				boolean match = false;
				
				while (index < menu.menuItems.size()) {
					MenuItem temp = menu.menuItems.get(index);
					if (menu.menuItems.get(index).category == type) {
						match = true;
						nextCandidate= temp;
						break;
					}
					index++;
				}
				
				if (!match)
					nextCandidate = null;
				else
					index++;
				
				return match;
			}
	
			@Override
			public MenuItem next() {
				if (nextCandidate == null)
					throw new NoSuchElementException();
				else
					return nextCandidate;
			}

			@Override
			public MenuItem remove() {
				// TODO Auto-generated method stub
				return null;
			}		
		}
	
	private class PriceIterator implements MenuIterator {
		
		private Menu menu;
		private double price;
		MenuItem nextCandidate;
		int index = 0;
		
		public PriceIterator(Menu menu, double price) {
			this.menu = menu;
			this.price = price;
		}
		
		@Override
		public boolean hasNext() {
			boolean match = false;
			
			while (index < menu.menuItems.size()) {
				MenuItem temp = menu.menuItems.get(index);
				if (menu.menuItems.get(index).price <= price && menu.menuItems.get(index).category == menu.MAIN_DISH) {
					match = true;
					nextCandidate= temp;
					break;
				}
				index++;
			}
			
			if (!match)
				nextCandidate = null;
			else
				index++;
			
			return match;
		}

		@Override
		public MenuItem next() {
			if (nextCandidate == null)
				throw new NoSuchElementException();
			else
				return nextCandidate;
		}

		@Override
		public MenuItem remove() {
			// TODO Auto-generated method stub
			return null;
		}			
	}
	
	private class HeartHealthyIterator implements MenuIterator {
			
			private Menu menu;
			private boolean healthy;
			MenuItem nextCandidate;
			int index = 0;
			
			public HeartHealthyIterator(Menu menu) {
				this.menu = menu;
			}
			
			@Override
			public boolean hasNext() {
				boolean match = false;
				
				while (index < menu.menuItems.size()) {
					MenuItem temp = menu.menuItems.get(index);
					if (menu.menuItems.get(index).healthy == true) {
						match = true;
						nextCandidate= temp;
						break;
					}
					index++;
				}
				
				if (!match)
					nextCandidate = null;
				else
					index++;
				
				return match;
			}
	
			@Override
			public MenuItem next() {
				if (nextCandidate == null)
					throw new NoSuchElementException();
				else
					return nextCandidate;
			}

			@Override
			public MenuItem remove() {
				// TODO Auto-generated method stub
				return null;
			}		
		}
	
}
