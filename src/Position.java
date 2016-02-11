import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mbaltac on 2/11/2016.
 */

public class Position {
    public int x;
    public int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Position a){
        return Math.sqrt(Math.pow(a.x-x, 2.)+Math.pow(a.y-y, 2.));
    }

    public void sortDrones(List<Drone> drs){
        Collections.sort(drs, new Comparator<Drone>() {
            @Override
            public int compare(Drone drone, Drone t1) {
                return Double.compare(distance(drone.pos), distance(t1.pos));
            }
        });
    }

}
