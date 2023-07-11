
public class Menu {

	private String title;
	private String description;
	private double price;
	private Chef chef;
	
	public Menu(String title,String description, double price) 
	{	
		this.title = title;
		this.description = description;
		this.price = price;
	}

	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }

	public Chef getChef() { return chef; }
	public void setChef(Chef chef) { this.chef = chef; }

	@Override
	public String toString() {
		return "Menu [title=" + title + ", description=" + description + ", price=" + price + "]" + chef.toString();
	}
	
}
