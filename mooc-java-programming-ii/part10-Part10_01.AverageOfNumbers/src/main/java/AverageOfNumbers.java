
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            list.add(word);
        }
        double average = list.stream().mapToDouble(number -> Double.parseDouble(number)).average().getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
