package lesson_11;

public class Animal {

    String name;
    public int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    // Support method
    protected String addAnimalPrefix() {
        return "My name is," + this.name;
    }


}
