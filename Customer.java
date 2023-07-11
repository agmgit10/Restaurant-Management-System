
public class Customer extends Person{

	private Waitress waitress;
	private Table table;
	private String phone;
	
	public Customer(String name, String surname, int id)
	{
		super(name, surname, id);
		this.waitress = null;
		this.table = null;
	}

	@Override
	public double getMoney() { return super.getMoney(); }
	@Override
	public void setMoney(double money) { super.setMoney(money); }	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public String toString() {
		return "Customer "+ super.toString() ;
	}

	@Override
	public void money() {
		System.out.println("Salary of the customer = " + super.getMoney() / 10);
		
	}
	

	
}
