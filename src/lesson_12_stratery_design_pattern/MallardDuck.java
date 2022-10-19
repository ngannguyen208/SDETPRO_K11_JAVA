package lesson_12_stratery_design_pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
    }
}
