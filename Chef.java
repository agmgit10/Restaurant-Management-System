
public class Chef extends Person{
	
	private Menu[] menu = new Menu[100];
    private int menu_counter = 0;

	public Chef(String name, String surname, int id)
	{
		super(name, surname, id);
	}

	
	public String toString() {
		return "Chef "+ super.toString();
	}


	@Override
	public void money() {
		System.out.println("Salary of the chef = " + super.getMoney() / 10);
		
	}
	
	
}
