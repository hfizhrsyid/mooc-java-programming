public class OneItemBox extends Box {
    private Item oneItem;
    
    public void add(Item item) {
        if (oneItem == null) {
            oneItem = item;
        }
    }

    public boolean isInBox(Item item) {
        if (item.equals(oneItem)) {
            return true;
        }
        return false;
    }
}
