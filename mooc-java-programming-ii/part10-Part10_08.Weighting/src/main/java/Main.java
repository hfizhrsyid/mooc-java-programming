

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("Book", 7);
        Suitcase suitcase = new Suitcase(24);

        suitcase.addItem(book);
        suitcase.addItem(book);
        suitcase.addItem(book);

        suitcase.printItems();
        System.out.println(suitcase);

        Hold hold = new Hold(64);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase);

        hold.printItems();
        System.out.println(hold);
    }

}
