import java.util.HashMap;


public class Warehouse {
	
	public Warehouse(int x, int y, int pt)
	{
		pos = new Position(x, y);
		products = new int[pt];
		reservedProd = new int[pt];
	}
	
	public final Position pos;

	public int[] reservedProd;
	public int[] products;
}
