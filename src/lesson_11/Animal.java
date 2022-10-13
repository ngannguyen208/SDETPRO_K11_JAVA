package lesson_11;

public class Animal {

    private String name;
    int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    // Support method
    private String addAnimalPrefix() {
        return "My name is," + this.name;
    }


}
