package UserModule;

import CartModule.Cart;
import CartModule.Item;


public class Customer {
	
	private Account account;
	
	private Cart cart;
	
	private Order order;
	
	Shipment shipmentObj = new Shipment();
	
	public void addItemToCart(Item item) {
		 cart.addItem(item);
	}
	
	public void removeItemFromCart(Item item) {
		cart.removeItem(item);
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void placeOrder(Order order) {
		shipmentObj.setOrderDetails(order);
	}
	
}
