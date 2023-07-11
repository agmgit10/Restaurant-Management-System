
public class Table {

	private int numTable;
	private boolean isFilled;
	private int numberofSeats;
	
	public Table(int numTable, int numberofSeats) 
	{
		this.numTable = numTable;	
		this.numberofSeats = numberofSeats;
		isFilled = false;
	}
	
	
	public int getNumTable() { return numTable; }
	public void setNumTable(int numTable) { this.numTable = numTable; }
	
	public boolean isFilled() { return isFilled; }
	public void setFilled(boolean isFilled) { this.isFilled = isFilled; }
	
	public int getNumberofSeats() { return numberofSeats; }
	public void setNumberofSeats(int numberofSeats) { this.numberofSeats = numberofSeats; }
	
	@Override
	public String toString() {
		return "Table [numTable=" + numTable + ", isFilled=" + isFilled + ", numberofSeats=" + numberofSeats + "]";
	}

	
	public void sitTable()
	{
		isFilled = true;
	}
	
	public void emptyTable()
	{
		isFilled = false;
	}
}
