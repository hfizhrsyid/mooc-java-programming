
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {8000, 2, 3, 4};
        System.out.println(sum(numbers, 0, 1, 90, 1000));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere > array.length) {
            toWhere = array.length;
        }

        int total = 0;
        
        for(int i = fromWhere; i < toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                total += array[i];        
            }
        }

        return total;
    }
}
