public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Item item = (Item) object;

        if (this.product.equals(item.product) && this.unitPrice == item.unitPrice) {
            return true;
        }
        
        return false;
    }
}
