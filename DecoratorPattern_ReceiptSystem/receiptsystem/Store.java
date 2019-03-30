package receiptsystem;

import java.util.ArrayList;

public class Store {
    
    private ArrayList<StoreItem> itemsList;
//    private Orders orders;
//    private Tab tab;
    
    public Store(){
    	itemsList = new ArrayList<StoreItem>();
        populateStoreItems();
        
        //orders = new Orders();
    }
    
    // --- private methods
    private void populateStoreItems(){
        itemsList.add(new StoreItem("1001", "Ducky Mechanical Keyboard", "112.50"));
        itemsList.add(new StoreItem("1002", "USB 19GB Thumbdrive", "12.80"));
        itemsList.add(new StoreItem("1003", "Dell Optiplex 3020", "852.90"));
        itemsList.add(new StoreItem("1004", "Logitech Bluetooth Mouse", "32.98"));
        itemsList.add(new StoreItem("1005", "Logitech USB Keyboard", "22.45"));
        itemsList.add(new StoreItem("1006", "InCase 13\" Laptop Case", "48.25"));
        itemsList.add(new StoreItem("1007", "Samsung J7 Cell Phone, black", "285.50"));
        itemsList.add(new StoreItem("1008", "Apple 13\" Macbook Pro", "1390.65"));
        itemsList.add(new StoreItem("1009", "WD 500GB SSD hard drive", "192.50"));
        itemsList.add(new StoreItem("1010", "USB 8GB Thumbdrive", "7.50"));
    }
    
}

