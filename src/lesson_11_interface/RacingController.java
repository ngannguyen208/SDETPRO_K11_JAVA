package lesson_11_interface;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public MoveAble printOutTheWinner(List<MoveAble> moveAbleObjects) {
        MoveAble winner = moveAbleObjects.get(0);
        winner.abc();
//        for (MoveAble moveAbleObject : moveAbleObjects) {
//            if (moveAbleObject.move();)
//        }
        return winner;
    }

    public static void main(String[] args) {
        MoveAble superMan = new SuperMan();
        MoveAble dog = new Dog();
        Tree tree = new Tree();

        new RacingController().printOutTheWinner(Arrays.asList(superMan, dog));

    }

}
