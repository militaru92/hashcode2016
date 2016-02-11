import java.util.ArrayList;


public class Warehouse {
	
	public Warehouse(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		products = new ArrayList<Integer>();
		
		
	}
	
	public int x;
	public int y;
	
	public ArrayList<Integer> products;

}
