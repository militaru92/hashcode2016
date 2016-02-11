import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ParseInput {
	
	public ParseInput(String file_name)
	{
		Terrain.product_types_weights = new ArrayList<Integer>();
		Terrain.warehouses = new ArrayList<Warehouse>();
		Terrain.orders = new ArrayList<Order>();
		Terrain.droneCommands = new ArrayList<DroneCom>();
		try {
			in = new BufferedReader(new FileReader(file_name));
			String[] data_overview = in.readLine().split(" ");
			
			Terrain.num_grid_rows = Integer.parseInt(data_overview[0]);
			Terrain.num_grid_cols = Integer.parseInt(data_overview[1]);
			int D = Integer.parseInt(data_overview[2]);
			Terrain.drones = new ArrayList<Drone>(D);

			Terrain.max_turns = Integer.parseInt(data_overview[3]);
			Terrain.max_load = Integer.parseInt(data_overview[4]);
			
			String line = in.readLine();
			
			P = Integer.parseInt(line);

			for(int j = 0; j<D; j++) {
				Terrain.drones.add(j, new Drone(P));
			}

			data_overview = in.readLine().split(" ");
			
			for( int i = 0; i < P; ++i)
			{
				Terrain.product_types_weights.add(Integer.parseInt(data_overview[i])); 
			}
			
			line = in.readLine();
			
			W = Integer.parseInt(line);
			
			for( int i = 0; i < W; ++i)
			{
				data_overview = in.readLine().split(" ");
				
				int x = Integer.parseInt(data_overview[0]);
				int y = Integer.parseInt(data_overview[1]);
				
				Warehouse warehouse = new Warehouse(x,y, P);
				
				data_overview = in.readLine().split(" ");
				
				for( int j = 0; j < P; ++j)
				{

					warehouse.products[j] = Integer.parseInt(data_overview[j]);
				}
				
				Terrain.warehouses.add(warehouse);
				
			}
			
			line = in.readLine();
			
			C = Integer.parseInt(line);
			
			for( int i = 0; i < C; ++i)
			{
				data_overview = in.readLine().split(" ");
				
				Order order = new Order(P);
				
				int x = Integer.parseInt(data_overview[0]);
				int y = Integer.parseInt(data_overview[1]);
				
				order.pos.x = x;
				order.pos.y = y;
				
				line = in.readLine();
				
				order.L = Integer.parseInt(line);
				
				data_overview = in.readLine().split(" ");
				
				for( int j = 0; j < order.L; ++j)
				{
					order.products[j] = Integer.parseInt(data_overview[j]);
				}
				
				Terrain.orders.add(order);
				
				
				
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	public void write() {
		
		for(int i = 0; i < Terrain.orders.size(); ++i)
		{
			System.out.println(Integer.toString(Terrain.orders.get(i).x) + " -- " + Integer.toString(Terrain.orders.get(i).y));			
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
	
}
