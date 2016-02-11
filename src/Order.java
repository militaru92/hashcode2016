import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Order {
	
	public Order()
	{
		products = new HashMap<Integer, Item>();
	}
	public Position pos;
	public int L; //number of products
	public HashMap<Integer, Item> products;


}
