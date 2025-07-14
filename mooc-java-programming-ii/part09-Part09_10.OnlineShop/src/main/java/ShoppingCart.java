import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void add(String product, int price) {
        for(Item item : this.list) {
            if (item.equals(new Item(product, 1, price))) {
                item.increaseQuantity();
                return;
            }
        }
        list.add(new Item(product, 1, price));
    }

    public int price() {
        int total = 0;
        for(Item i : this.list) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for(Item item : this.list) System.out.println(item);
    }


}
