import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        if (isInPipe()) {
            T taken = this.pipe.get(0);
            this.pipe.remove(0);
            return taken;
        }
        return null;
    }

    public boolean isInPipe() {
        if (this.pipe.isEmpty()) {
            return false;
        }

        return true;
    }
}
