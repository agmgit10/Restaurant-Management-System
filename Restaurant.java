import java.util.Scanner;

public class Restaurant implements Date{

	private String address;
	private String phone ;
	private double rating;
	
	private int customer_counter = 0;
	private int table_counter = 0;
	private int order_counter = 0;
	private int menu_counter = 0;
	
	Scanner scn = new Scanner(System.in);
	Customer [] customer = new Customer[100];
	Table [] table = new Table[100];
	Order [] order = new Order[100];
	private Menu[] menu = new Menu[100];
    

	public Restaurant() 
	{			
		address = "Serdivan";
		phone = "2641317";
		rating = 4.4;
		//dateOfTheEvent(1996,07,17);
		
		Boss boss = new Boss("Ezgi Berfin","ÞAHÝN",53);
		while(true)
		{
			System.out.print("Choose your operation = ");
			String operation = scn.nextLine();
			
			if(operation.equals("Add Customer"))
			{
				System.out.print("Name of the customer = ");
				String name = scn.nextLine();
				System.out.print("Surname of the customer = ");
				String surname = scn.nextLine();
				System.out.print("Quantity of order = ");
				int quantity = scn.nextInt();
				addCustomer(name,surname);
				displayCustomer();
				addOrder(new Customer(name,surname,customer_counter),quantity);
				displayOrder();
			}
			else if(operation.equals("Add Table"))
			{			
				System.out.print("Number of seats = ");
				int seatnum = scn.nextInt();
				addTable(seatnum);
				displayTables();	
			}
			else if(operation.equals("Add Cashier") || operation.equals("Add Chef") || operation.equals("Add Waitress"))
			{
				System.out.print("Type of the worker = ");
				String worker = scn.nextLine();
				boss.hireStaff(worker);				
			}
			else if(operation.equals("Add Food"))
			{
				System.out.print("Title of the food = ");
				String title = scn.nextLine();
				System.out.print("Description of the food = ");
				String description = scn.nextLine();	
				System.out.print("Price of the food = ");
				double price = scn.nextDouble();
				System.out.println("Chef name = ");
				String name = scn.next();
				System.out.println("Chef surname = ");
				String surname = scn.next();
				addMenu(new Chef(name,surname,menu_counter),title, description, price);
				displayMenu();
			}		
		}
	}


	@Override
	public String toString() {
		return "Restaurant [address=" + address + ", phone=" + phone + ", rating=" + rating + "]";
	}
	
	public void addCustomer(String name, String surname)
	{
		customer[customer_counter] = new Customer( name,  surname,  customer_counter); 
		customer_counter++; 
	}
	
	public void displayCustomer()
	{		
		for(int i = 0;i<customer_counter;i++)
		{
			System.out.println(customer[i].getName() + customer[i].getSurname() + customer[i].getId());
		}
	}
	
	public void addTable(int numberofSeats)
	{
		table[table_counter] = new Table(table_counter,numberofSeats); 
		table[table_counter].setFilled(true);
		table_counter++; 
	}
	
	public void displayTables()
	{
		for(int i = 0;i<table_counter;i++)
		{
			System.out.println(table[i].toString());
		}
	}
	
	public void addOrder(Customer c,int orderQuantity)
	{
		order[order_counter] = new Order(order_counter,orderQuantity);
		order[order_counter].setCustomer(c);
		order_counter++;
	
	}
	
	public void displayOrder()
	{
		for(int i=0;i<order_counter;i++)
		{
			System.out.print(order[i].toString());
			System.out.println();
		}
	}

	public void addMenu(Chef chef,String title,String description, double price)
	{
		menu[menu_counter] = new Menu(title,description,price);
		menu[menu_counter].setChef(chef);
		menu_counter++;	
	}
	
	public void displayMenu()
	{
		for(int i=0;i<menu_counter;i++)
		{
			System.out.print(menu[i].toString());
		}
	}
	
	@Override
	public void dateOfTheEvent(int year, int month, int day) {

		System.out.print("Date of foundation = " + day + "." + month + "." + year);
	}

}
