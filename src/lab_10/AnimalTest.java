package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public void racingAnimal(List<Animal> animalList) {
        int maxSpeed = 0;
        String animalName = "";
        int animalSpeed = 0;
        for (Animal animal : animalList) {
            animalSpeed = animal.getSpeed();
            animalName = animal.getName();
            if (maxSpeed < animal.getSpeed()) {
                maxSpeed = animalSpeed;
                System.out.println(animal.getName() + " with speed: " + animalSpeed);
            }
        }
        System.out.println("Winner is " + animalName + " with speed: " + animalSpeed);
    }

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        animalTest.racingAnimal(animalList);
    }
}
