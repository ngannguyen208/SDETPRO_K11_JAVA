package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab_09.Animal.Builder;

public class RacingAnimal {

    public void getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0); // con dau tien chien thang

        for (Animal animal : animalList) {
            if (!animal.isWithWings()) {
                if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
                }
            }
        }

        System.out.println("The Winner is: " + winner);
        System.out.println("The Winner speed was: " + winner.getSpeed());
    }

    public static void main(String[] args) {

        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(60)).setWithWings(true).build();
        Animal falcon = new Animal.Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(60)).setWithWings(true).build();
        Animal tiger = new Animal.Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(60)).setWithWings(false).build();
        Animal dog = new Animal.Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(60)).setWithWings(false).build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(eagle);
        animalList.add(falcon);
        animalList.add(tiger);
        animalList.add(dog);

        RacingAnimal racingAnimal = new RacingAnimal();
        racingAnimal.getWinner(animalList);


    }
}
