public class Order {
	
	private int orderID;
	private int orderQuantity;
	private Customer customer;
	private Menu menu;
	
	public Order(int orderID, int orderQuantity) 
	{
		this.orderID = orderID;
		this.orderQuantity = orderQuantity;
	}
	
	public int getOrderID() { return orderID; }
	public void setOrderID(int orderID) { this.orderID = orderID; }
	
	public int getOrderQuantity() { return orderQuantity; }
	public void setOrderQuantity(int orderQuantity) { this.orderQuantity = orderQuantity; }

	public Customer getCustomer() { return customer; }
	public void setCustomer(Customer customer) { this.customer = customer; }

	public Menu getMenu() {	return menu; }
	public void setMenu(Menu menu) { this.menu = menu; }
	
	
	@Override
	public String toString() {
		return "Order orderID=" + orderID + ", orderQuantity=" + orderQuantity + customer.toString() ;
	}
}
