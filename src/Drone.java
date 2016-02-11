/**
 * Created by mbaltac on 2/11/2016.
 */
public class Drone {

    public Drone(int pt)
    {
        deliverTime = -1;
        order = null;
        products = new int[pt];
        reservedProd = new int[pt];
    }

    public Position pos;
    public int deliverTime;
    public Order order;

    public int[] reservedProd;
    public int[] products;
}
