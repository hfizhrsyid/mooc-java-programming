import java.util.ArrayList;

public class Box implements Packable {
    private double maximumWeight;
    private ArrayList<Packable> box;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        box = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= maximumWeight) {
            box.add(packable);
        }
    }

    public double weight() {
        double max = 0;
        for(Packable packable : box) {
            max += packable.weight();
        }
        return max;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}
