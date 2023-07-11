
public class Cashier extends Person {
	public Cashier(String name, String surname, int id)
	{
		super(name, surname, id);
	}

	
	public String toString() {
		return "Cashier "+ super.toString();
	}


	@Override
	public void money() {
		System.out.println("Salary of the cashier = " + super.getMoney() / 10);
		
	}
}
