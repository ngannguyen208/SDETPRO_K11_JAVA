package lesson_12_stratery_design_pattern;

public class DuckTest {

    public static void main(String[] args) {
        Duck babyDuck = new BabyDuck();
        Duck mallardDuck = new MallardDuck();

        DuckTest duckTest = new DuckTest();

        babyDuck.setQuackBehavior(new Quack());
        duckTest.performQuack(babyDuck);
        duckTest.performQuack(mallardDuck);
    }

    public void performQuack(Duck duck) {
        duck.performQuack();
    }

}
