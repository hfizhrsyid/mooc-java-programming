import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private T hideout;

    public Hideout() {
        this.hideout = null;
    }

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }

    public T takeFromHideout() {
        T taken = this.hideout;
        this.hideout = null;
        return taken;
    }

    public boolean isInHideout() {
        if (this.hideout == null) {
            return false;
        }

        return true;
    }
}
