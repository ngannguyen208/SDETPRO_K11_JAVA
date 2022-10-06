package lab_08.lab_08_teacher;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {

    public void printTheWinner(List<Animal> animalList) {
        // Check empty, 1 element, null animalList

        Animal winner = animalList.get(0); // con dau tien chien thang

        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }

        System.out.println("The Winner is: " + winner);
        System.out.println("The Winner speed was: " + winner.getSpeed());
    }

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();
        Animal dog = new Dog("Dog");
        Animal horse = new Horse("Horse");

        List<Animal> animalList = Arrays.asList(dog, horse);
        animalRacing.printTheWinner(animalList);
    }
}
