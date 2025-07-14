public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {
        tacos -= 1;

        if (tacos < 0) {
            tacos = 0;
        }
    }
}
