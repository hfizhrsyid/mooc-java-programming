
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(p -> p.split(","))
                .sorted((p1, p2) -> {
                        if (Double.parseDouble(p1[5]) > Double.parseDouble(p2[5])) {
                            return 1;
                        } else if (Double.parseDouble(p1[5]) < Double.parseDouble(p2[5])) {
                            return -1;
                        } else {
                            return 0;
                        }
                    })
                .map(p -> p[3] + " (" + p[4] + ")" + ", " + p[2].replace("(%)","").trim() + ", " + p[5])
                .forEach(p -> System.out.println(p));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
