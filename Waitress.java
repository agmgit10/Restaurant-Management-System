
public class Waitress extends Person {

	public Waitress(String name, String surname, int id)
	{
		super(name, surname, id);
	}

	
	public String toString() {
		return "Waitress " + super.toString();
	}


	@Override
	public void money() {
		System.out.println("Salary of the waitress = " + super.getMoney() / 100);
		
	}
	
	
}
