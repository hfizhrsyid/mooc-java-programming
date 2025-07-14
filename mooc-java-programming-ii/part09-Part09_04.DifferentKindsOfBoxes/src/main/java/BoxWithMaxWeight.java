import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            items.add(item);
            capacity -= item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        for(Item i : items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
