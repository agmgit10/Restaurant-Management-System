public class Bill implements Date{

	private double cost;
	private int billID;
	private Date date;
	
	public Bill() 
	{	
		billID = new Integer(billID + 1);	
	}
	
	public Bill(double cost,int billID)
	{
		this.cost = cost;
		this.billID = billID;
	    dateOfTheEvent(1998,20,05);
	}
	
	public double getCost() { return cost; }
	public void setCost(double cost) { this.cost = cost; }
	
	public int getBillID() { return billID;	}
	public void setBillID(int billID) { this.billID = billID; }

	@Override
	public void dateOfTheEvent(int year, int month, int day) 
	{
		System.out.print("Date of bill = " + day + "." + month + "." + year);
		
	}
}
