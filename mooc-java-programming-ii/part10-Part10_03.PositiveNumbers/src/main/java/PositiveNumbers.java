import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }
            list.add(number);
        }

        System.out.println(positive(list));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> list = numbers.stream()
            .filter(number -> number > 0)
            .collect(Collectors.toList());
        return list;
    }
}
