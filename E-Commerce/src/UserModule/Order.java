package UserModule;

import java.util.Date;
import java.util.List;

public class Order {
	
	private String orderNumber;
	
	private Date orderDate;
	
	private String userName;
	
	private OrderStatus status;
	
	private List<OrderLog> orderLog;

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the status
	 */
	public OrderStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	/**
	 * @return the orderLog
	 */
	public List<OrderLog> getOrderLog() {
		return orderLog;
	}

	/**
	 * @param orderLog the orderLog to set
	 */
	public void setOrderLog(List<OrderLog> orderLog) {
		this.orderLog = orderLog;
	}
	
	public boolean sendForShipment() {
		return false;
	}
	
	public boolean makePayment() {
		return true;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
