package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    public static Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0); // con dau tien chien thang
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Animal horse = new Horse();
        System.out.println("Name: " + horse.getName() + " Speed: " + horse.getSpeed());
        Animal tiger = new Tiger();
        System.out.println("Name: " + tiger.getName() + " Speed: " + tiger.getSpeed());
        Animal dog = new Dog();
        System.out.println("Name: " + dog.getName() + " Speed: " + dog.getSpeed());

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        animalRacing.getWinner(animalList);

        Animal winner = animalRacing.getWinner(animalList);
        System.out.println("---------------");
        System.out.println("The winner is: " + winner.getName() + " with speed " + winner.getSpeed());

    }
}
