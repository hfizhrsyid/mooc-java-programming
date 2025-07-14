public class Student extends Person {
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        credit = 0;
    }

    public int credits() {
        return credit;
    }

    public void study() {
        credit += 1;
    }

    @Override
    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  " + "Study credits " + credit;
    }
}
