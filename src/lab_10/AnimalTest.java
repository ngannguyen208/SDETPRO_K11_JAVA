package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public void racingAnimal(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed())
            {
                winner = animal;
            }
        }
        System.out.println("The winner is " + winner.getName() + " with speed " + winner.getSpeed());
    }

    public void printAnimalInfo(Animal animal) {
        System.out.println(animal.getAnimalInfo());
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();


        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        AnimalTest animalTest = new AnimalTest();
        animalTest.printAnimalInfo(dog);
        animalTest.printAnimalInfo(horse);
        animalTest.printAnimalInfo(tiger);
        animalTest.racingAnimal(animalList);

    }
}
