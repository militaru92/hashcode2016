import java.util.ArrayList;

public class Terrain {
	
	private Terrain() {
	}
	
	public static int num_grid_rows;
	public static int num_grid_cols;
	public static int max_turns;
	public static int max_load;
	
	public static ArrayList<Warehouse> warehouses;
	public static ArrayList<Order> orders;
	public static ArrayList<Drone> drones;
	public static ArrayList<DroneCom> droneCommands;
	public static ArrayList<Integer> product_types_weights;

}
