public class CD implements Packable {
    private String artist;
    private String nameOfCD;
    private int yearPublished;
    private double weight;

    public CD(String artist, String nameOfCD, int yearPublished) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.yearPublished = yearPublished;
        this.weight = 0.1;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + nameOfCD + " (" + yearPublished + ")";
    }
}
