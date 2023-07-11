
public abstract class Person {
	
	private String name;
	private String surname;
	private int id;
	public double money = 100000.0;
	
	
	public Person(String name, String surname, int id) 
	{	
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getSurname() { return surname; }
	public void setSurname(String surname) { this.surname = surname; }
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public double getMoney() { return money; }
	public void setMoney(double money) { this.money = money; }

	@Override
	public String toString() {
		return "[name = " + name + ", surname = " + surname + ", id = " + id + "]";
	}

	public abstract void money();
}
