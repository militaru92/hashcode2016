import java.util.HashMap;


public class Warehouse {
	
	public Warehouse(int x, int y)
	{
		pos = new Position(x, y);
		products = new HashMap<Integer, Item> ();
		reservedProd = new HashMap<Integer, Item> ();
	}
	
	public final Position pos;

	public HashMap<Integer, Item> reservedProd;
	public HashMap<Integer, Item> products;
}
