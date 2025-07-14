
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        double averageOfPositives = list.stream()
            .mapToDouble(number -> Double.parseDouble(number))
            .filter(number -> number >= 0)
            .average()
            .getAsDouble();

        double averageOfNegatives = list.stream()
            .mapToDouble(number -> Double.parseDouble(number))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();

        if (choice.equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPositives);
        } else if (choice.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegatives);
        } else {
            return;
        }
    }
}
