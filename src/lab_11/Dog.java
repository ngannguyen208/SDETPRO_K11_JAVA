package lab_11;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {

    private String name;
    private int speed;
    private boolean withWings;
    static final int DOG_MAX_SPEED = 50;

    public Dog() {
        name = "Dog";
        speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
        withWings = flyAble();
    }

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }


}
