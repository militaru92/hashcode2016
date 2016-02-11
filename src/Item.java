/**
 * Created by mbaltac on 2/11/2016.
 */
public class Item {
    public int type;
    public Order reservedFor;
    public int weight;

    public Item (int t, int w) {
        type = t;
        weight = w;
        reservedFor = null;
    }

}
