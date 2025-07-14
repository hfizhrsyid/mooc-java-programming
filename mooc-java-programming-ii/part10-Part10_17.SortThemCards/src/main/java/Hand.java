import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int totalValue() {
        int total = 0;
        
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            Card card = iterator.next();
            total += card.getValue();
        }

        return total;
    }

    public void sortBySuit() {
        this.sort();
        Collections.sort(hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }
}
