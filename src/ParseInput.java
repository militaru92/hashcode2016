import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ParseInput {
	
	public ParseInput(String file_name)
	{
		product_types_weights = new ArrayList<Integer>();
		warehouses = new ArrayList<Warehouse>();
		orders = new ArrayList<Order>();
		try {
			in = new BufferedReader(new FileReader(file_name));
			String[] data_overview = in.readLine().split(" ");
			
			num_grid_rows = Integer.parseInt(data_overview[0]);
			num_grid_cols = Integer.parseInt(data_overview[1]);
			num_drones = Integer.parseInt(data_overview[2]);
			T = Integer.parseInt(data_overview[3]);
			max_load = Integer.parseInt(data_overview[4]);
			
			String line = in.readLine();
			
			P = Integer.parseInt(line);
			
			data_overview = in.readLine().split(" ");
			
			for( int i = 0; i < P; ++i)
			{
				product_types_weights.add(Integer.parseInt(data_overview[i])); 
			}
			
			line = in.readLine();
			
			W = Integer.parseInt(line);
			
			for( int i = 0; i < W; ++i)
			{
				data_overview = in.readLine().split(" ");
				
				int x = Integer.parseInt(data_overview[0]);
				int y = Integer.parseInt(data_overview[1]);
				
				Warehouse warehouse = new Warehouse(x,y);
				
				data_overview = in.readLine().split(" ");
				
				for( int j = 0; j < P; ++j)
				{
					warehouse.products.add(Integer.parseInt(data_overview[j]));
				}
				
				warehouses.add(warehouse);
				
			}
			
			line = in.readLine();
			
			C = Integer.parseInt(line);
			
			for( int i = 0; i < C; ++i)
			{
				data_overview = in.readLine().split(" ");
				
				Order order = new Order();
				
				int x = Integer.parseInt(data_overview[0]);
				int y = Integer.parseInt(data_overview[1]);
				
				order.x = x;
				order.y = y;
				
				line = in.readLine();
				
				order.L = Integer.parseInt(line);
				
				data_overview = in.readLine().split(" ");
				
				for( int j = 0; j < order.L; ++j)
				{
					order.products.add(Integer.parseInt(data_overview[j]));
				}
				
				orders.add(order);
				
				
				
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	public void write() {
		
		for(int i = 0; i < orders.size(); ++i)
		{
			System.out.println(Integer.toString(orders.get(i).x) + " -- " + Integer.toString(orders.get(i).y));			
		}
	}

	
	private BufferedReader in;
	public int num_grid_rows;
	public int num_grid_cols;
	public int num_drones;
	public int T;
	public int P;
	public int W;
	public int C;
	public int max_load;
	public ArrayList<Integer> product_types_weights;
	public ArrayList<Warehouse> warehouses;
	public ArrayList<Order> orders;
	
}
