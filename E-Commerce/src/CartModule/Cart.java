package CartModule;

import java.util.List;



public class Cart {
	
	private List<Item> Item;

	/**
	 * @return the Item
	 */
	public List<Item> getItem() {
		return Item;
	}

	/**
	 * @param Item the Item to set
	 */
	public void setItem(List<Item> Item) {
		this.Item = Item;
	}
	
	public void addItem(Item item) {
		Item.add(item);
	}
	
	public void removeItem(Item item) {
		for(Item items: Item) {
			if(items.getProductId().equalsIgnoreCase(item.getProductId())) {
				Item.remove(items);
			}
		}
	}
	
	public void updateItemQuantity(Item item, int quantity) {
		for(Item items: Item) {
			if(items.getProductId().equalsIgnoreCase(item.getProductId())) {
				items.setQuantity(quantity);
			}
		}
	}
	
	public List<Item> getItems(){
		return this.Item;
	}
	
	public boolean checkout() {
		return true;
	}
	
	
	
	
}
