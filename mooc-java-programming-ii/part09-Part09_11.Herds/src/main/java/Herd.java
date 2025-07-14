import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable movable : this.list) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String myString = new String();
        for(Movable i : this.list) {
            myString += i.toString() + "\n";
        }
        return myString;
    }
}
