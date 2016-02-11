import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ParseInput parser = new ParseInput("test.in");
		
		
		// Analyse terrain
		//TerrainAnalyser Analyzer = new Analyzer()
		
		int turn = 0;
		ArrayList<Drone> freeDrones = new ArrayList<Drone>();
		
		
		while (turn < Terrain.max_turns) {
			for (int i = 0; i < Terrain.drones.size(); ++i) {
				Drone dr = Terrain.drones.get(i);
				if (dr.deliverTime == turn)
					// Drone is free
					freeDrones.add(dr);
					
			}
		}
		

	}

}
