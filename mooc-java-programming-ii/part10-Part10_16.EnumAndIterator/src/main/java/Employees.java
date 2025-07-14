import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> listOfEmployee;

    public Employees() {
        listOfEmployee = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.listOfEmployee.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for(Person person: peopleToAdd) {
            this.listOfEmployee.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.listOfEmployee.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.listOfEmployee.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.listOfEmployee.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}