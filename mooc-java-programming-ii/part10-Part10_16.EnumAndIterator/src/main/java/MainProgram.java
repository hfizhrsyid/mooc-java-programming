
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees employees = new Employees();
        employees.add(new Person("Hallo", Education.BA));
        employees.add(new Person("Hello", Education.HS));
        employees.add(new Person("Hall", Education.MA));
        employees.add(new Person("Halo", Education.PHD));
        employees.add(new Person("Hlo", Education.BA));
        employees.add(new Person("allo", Education.BA));
        employees.add(new Person("Hlo", Education.BA));

        employees.print();
        System.out.println();
        employees.print(Education.PHD);
        System.out.println();
        employees.fire(Education.PHD);
        employees.print(Education.PHD);

        employees.add(new Person("Hafizh", Education.PHD));

        employees.print(Education.PHD);
    }
}
