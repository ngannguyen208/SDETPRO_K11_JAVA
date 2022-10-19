package lesson_12_stratery_design_pattern;

public class BabyDuck extends Duck {

    public BabyDuck() {
        quackBehavior = new Squeak();
    }
}
