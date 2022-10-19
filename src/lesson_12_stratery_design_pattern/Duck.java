package lesson_12_stratery_design_pattern;

public class Duck {

    protected QuackBehavior quackBehavior;

    protected void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
