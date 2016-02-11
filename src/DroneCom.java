import java.util.ArrayList;
import hash.DroneCommand;

public class DroneCom {
	
	DroneCommand comm;
	int drone_num;
	int sd;
	int prod_type;
	int num_prod;
	int turns;
	
	public DroneCom(DroneCommand type, int drone_num, int sd, int prod_type, int num_prod, int turns) {
		comm = type;
		drone_num = drone_num;
		sd = sd;
		prod_type = prod_type;
		num_prod = num_prod;
		turns = turns;
	}
	
	public String toString() {
		String out = "";
		out.concat(Integer.toString(drone_num));
		switch (comm) {
		case LOAD:
			out.concat(" L ");
			break;
		case UNLOAD:
			out.concat(" U ");
			break;
		case DELIVER:
			out.concat(" D ");
			break;
			
		case WAIT:
			out.concat(" W " + Integer.toString(turns));
			return out;
		}

		out.concat(Integer.toString(sd) + " " + Integer.toString(prod_type) + " " + Integer.toString(num_prod));
		
		return out;
		
	}
}
