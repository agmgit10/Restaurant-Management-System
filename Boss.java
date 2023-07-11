import java.util.Scanner;

public class Boss extends Person {

	Scanner scn = new Scanner(System.in);
	
	Waitress [] waitress = new Waitress[10];	
	Chef [] chef = new Chef[10];
	Cashier [] cashier = new Cashier[10];
	
	private int waitress_counter;
	private int chef_counter;
	private int cashier_counter;
	
	public Boss(String name, String surname, int id)
	{
		super(name, surname, id);
		
	}
	
	public String toString() {
		return "Boss "+ super.toString();
	}


	@Override
	public void money() {
		System.out.println("Salary of the boss = " + super.getMoney() / 5);
		
	}
	public void addWaitress(String name,String surname)
	{
		waitress[waitress_counter] = new Waitress(name, surname, waitress_counter); 
		waitress_counter++; 
	}
	
	
	public void addChef(String name,String surname)
	{
		chef[chef_counter] = new Chef(name, surname, chef_counter); 
		chef_counter++; 
	}
	
	public void addCashier(String name,String surname)
	{
		cashier[cashier_counter] = new Cashier(name, surname, cashier_counter); 	
		cashier_counter++; 
	}
	
	
	public void displayWaitress()
	{
		for(int i = 0;i<waitress_counter;i++)
		{
			System.out.println(waitress[i].toString());
		}
	}
	
	public void displayChef()
	{
		for(int i = 0;i<chef_counter;i++)
		{
			System.out.println(chef[i].toString());
		}
	}
	
	public void displayCashier()
	{
		for(int i = 0;i<cashier_counter;i++)
		{
			System.out.println(cashier[i].toString());
		}
	}
	public void hireStaff(String worker)
	{
		System.out.print("Name of the worker = ");
		String name = scn.nextLine();
		System.out.print("Surname of the worker = ");
		String surname = scn.nextLine();	
		if(worker.equals("waitress")) 
		{
			addWaitress(name,surname);	
			displayWaitress();
			
		}
		if(worker.equals("chef")) 
		{
			addChef(name,surname);
			displayChef();
		}
		if(worker.equals("cashier")) 
		{
			addCashier(name,surname);
			displayCashier();
		}
		
	
	}
}
