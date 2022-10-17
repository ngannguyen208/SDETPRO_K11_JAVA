package lesson_11_interface;

public class SuperMan extends Human implements MoveAble, SwimAble {

    @Override
    public void move() {
        System.out.println("Di chuyen bang cach cua sieu nhan!");
    }

    @Override
    public void swim() {
        System.out.println("Boi bang cach cua sieu nhan!");
    }
}
