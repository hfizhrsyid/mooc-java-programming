
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(12);

        box.add(new Book("Hafizh", "Buku", 2));
        box.add(new Book("Hafozh", "Book", 7));
        box.add(new Book("Hafez", "BOOKOO", 1));

        box.add(new CD("Hapis", "CD1", 1923));
        box.add(new CD("Ha2is", "CD2", 1923));
        box.add(new CD("Ha3is", "CD3", 1923));

        box.add(new Box(1));
        box.add(new Box(2));

        System.out.println(box);
    }

}
