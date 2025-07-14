
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        NoiseCapable dog = new Dog("Hehe");
        dog.makeNoise();

        Dog doggy = (Dog) dog;
        doggy.bark();
    }

}
