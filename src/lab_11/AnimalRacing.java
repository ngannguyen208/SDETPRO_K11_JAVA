package lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {

    public static List<MoveAble> getAnimalFlyUnAble(List<FlyAble> flyAbleObjects) {
        List<MoveAble> listAnimalRacing = new ArrayList<>();
        for (FlyAble flyAbleObject : flyAbleObjects) {
            if (!flyAbleObject.flyAble()) {
                listAnimalRacing.add((MoveAble) flyAbleObject);
            }
        }
        System.out.println("List Animals Can Not Fly: " + listAnimalRacing);
        return listAnimalRacing;
    }

    public MoveAble printOutTheWinner(List<FlyAble> flyAbleObjects) {
        List<MoveAble> listAnimalRacing = AnimalRacing.getAnimalFlyUnAble(flyAbleObjects);
        MoveAble winner = listAnimalRacing.get(0);
        for (MoveAble moveAble : listAnimalRacing) {
            if (moveAble.speed() > winner.speed()) {
                winner = moveAble;
            }
        }
        System.out.println("The winner is: " + winner);
        return winner;
    }

    public static void main(String[] args) {

        FlyAble dog = new Dog();
        System.out.println(dog);
        FlyAble eagle = new Eagle();
        System.out.println(eagle);
        FlyAble falcon = new Falcon();
        System.out.println(falcon);
        FlyAble horse  = new Horse();
        System.out.println(horse);
        FlyAble lion = new Lion();
        System.out.println(lion);

        AnimalRacing animalRacing = new AnimalRacing();
        List<FlyAble> listAnimal = Arrays.asList(dog, eagle, falcon, horse, lion);
        MoveAble winner = animalRacing.printOutTheWinner(listAnimal);
    }
}
