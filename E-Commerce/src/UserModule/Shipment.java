package UserModule;

import java.util.Date;

public class Shipment {

	
	private String shipmentNumber;
	
	private Date shipmentDate;
	
	private Date estimatedArrival;
	
	private String shipmentMethod;
	
	Order orderDetails;

	/**
	 * @return the shipmentNumber
	 */
	public String getShipmentNumber() {
		return shipmentNumber;
	}

	/**
	 * @param shipmentNumber the shipmentNumber to set
	 */
	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	/**
	 * @return the shipmentDate
	 */
	public Date getShipmentDate() {
		return shipmentDate;
	}

	/**
	 * @param shipmentDate the shipmentDate to set
	 */
	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	/**
	 * @return the estimatedArrival
	 */
	public Date getEstimatedArrival() {
		return estimatedArrival;
	}

	/**
	 * @param estimatedArrival the estimatedArrival to set
	 */
	public void setEstimatedArrival(Date estimatedArrival) {
		this.estimatedArrival = estimatedArrival;
	}

	/**
	 * @return the shipmentMethod
	 */
	public String getShipmentMethod() {
		return shipmentMethod;
	}

	/**
	 * @param shipmentMethod the shipmentMethod to set
	 */
	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	/**
	 * @return the orderDetails
	 */
	public Order getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(Order orderDetails) {
		
		this.orderDetails = orderDetails;
		System.out.println("Order Number" + " " + this.orderDetails.getOrderNumber());
		System.out.println("Order UserName" +" " + this.orderDetails.getUserName());
		System.out.println("Successfull");
	}
	

	
}
