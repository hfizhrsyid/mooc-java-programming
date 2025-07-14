
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(word, age));
            System.out.println();
        }
        
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        printBook(books);
    }

    public static void printBook(ArrayList<Book> books) {
        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getName);
            
        Collections.sort(books, comparator);

        for(Book book: books) {
            System.out.println(book);
        }
    }
}
