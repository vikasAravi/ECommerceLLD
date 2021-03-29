import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import CartModule.Cart;
import CartModule.Item;
import UserModule.Account;
import UserModule.Customer;
import UserModule.Order;
import UserModule.OrderStatus;

public class MainModule {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Account acct = new Account();
		
		acct.setUserName("Vikash");
		acct.setPassword("vikky@123");
		acct.setEmail("vikash@gmail.com");
		acct.setUser("Vikas_Vikky");
		acct.setPhone("9367345634");
		acct.setCreditCards(null);
		acct.setShippingAddress(null);
		
		
		Item item1 = new Item();
		item1.setProductId("1");
		item1.setQuantity(5);
		item1.setPrice(567.00);
		
		Item item2 = new Item();
		item2.setProductId("2");
		item2.setPrice(678.00);
		item2.setQuantity(7);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		
		Cart cart = new Cart();
		cart.setItem(items);
		
		Item item3 = new Item();
		item3.setProductId("3");
		item3.setPrice(678.00);
		item3.setQuantity(7);
		
		cart.addItem(item3);
		
		Order order = new Order();
		order.setUserName("Vikash");
		order.setOrderDate(null);
		order.setOrderLog(null);
		order.setStatus(OrderStatus.UNSHIPPED);
		order.setOrderNumber("3566643");
		
		customer.setAccount(acct);
		customer.setCart(cart);
		customer.setOrder(order);
		
		customer.placeOrder(order);
		
	}
}
