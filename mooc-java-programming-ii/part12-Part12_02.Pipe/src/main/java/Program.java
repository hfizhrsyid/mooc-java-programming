
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        
        Pipe<String> pipe = new Pipe<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            pipe.putIntoPipe(input);
        }
        
        System.out.println(pipe.takeFromPipe());
        System.out.println(pipe.takeFromPipe());
    }
}
