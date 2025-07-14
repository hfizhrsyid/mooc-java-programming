import java.util.ArrayList;
import java.util.Arrays;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    public double maxValue() {
        if (!list.isEmpty()) {
            double max = list.get(0);
            for(double i : list) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
        return 0;
    }

    public double minValue() {
        if (!list.isEmpty()) {
            double min = list.get(0);
            for(double i : list) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
        return 0;
    }

    public double average() {
        if (!list.isEmpty()) {
            double total = 0;
            for(double i : list) {
                total += i;
            }
            total = total / list.size();
            return total;
        }
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(list.toArray());
    }
}
