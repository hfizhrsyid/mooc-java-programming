import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("Bro");
        names.add("Skuy");
        names.add("KRKRK");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list) {
        return list.size();
    }
}
