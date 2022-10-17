package lesson_11_interface;

public class Dog extends Animal implements MoveAble, SwimAble {

    @Override
    public void move() {
        System.out.println("Chay bang cach cua cho!");
    }

    @Override
    public void swim() {
        System.out.println("Boi bang cach cua cho!");
    }
}
