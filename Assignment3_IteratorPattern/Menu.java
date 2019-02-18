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
	 
	public void add(String name, int category, boolean healthy, double price) {
		MenuItem item = new MenuItem(name, category, healthy, price);
		menuItems.add(item);
	}
	
	public void delete(MenuItem item) {
		
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
				if (menu.menuItems.get(index).price <= price) {
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
		}
	
}
