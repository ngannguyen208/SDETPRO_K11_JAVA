package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingAnimal {

    public static Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0); // con dau tien chien thang
        for (Animal animal : animalList) {
            if (!animal.isWithWings()) {
                if (animal.getSpeed() > winner.getSpeed()) {
                    winner = animal;
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {

        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(50)).setWithWings(true).build();
        System.out.println(eagle);
        Animal falcon = new Animal.Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(50)).setWithWings(true).build();
        System.out.println(falcon);
        Animal tiger = new Animal.Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(50)).setWithWings(false).build();
        System.out.println(tiger);
        Animal dog = new Animal.Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(50)).setWithWings(false).build();
        System.out.println(dog);
        Animal cow = new Animal.Builder().setName("Cow").setSpeed(new SecureRandom().nextInt(50)).setWithWings(false).build();
        System.out.println(cow);

        RacingAnimal racingAnimal = new RacingAnimal();
        List<Animal> animalList = Arrays.asList(dog, tiger, falcon, eagle, cow);
        Animal winner = racingAnimal.getWinner(animalList);
        System.out.println("---------------");
        System.out.println("The winner is: " + winner.getName() + " with speed " + winner.getSpeed());

    }
}
