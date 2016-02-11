import javafx.geometry.Pos;

import java.util.HashMap;

/**
 * Created by mbaltac on 2/11/2016.
 */
public class Drone {

    public Drone(int i)
    {
        id = i;
        deliverTime = -1;
        order = null;
        products = new HashMap<Integer, Item> ();
        reservedProd = new HashMap<Integer, Item>();
    }

    public Position pos;
    public int id;
    public int deliverTime;
    public Order order;

    public HashMap<Integer, Item> reservedProd;
    public HashMap<Integer, Item> products;
}
