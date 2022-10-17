package lab_11;

import java.security.SecureRandom;

public class Lion implements MoveAble, FlyAble {

    private String name;
    private int speed;
    private boolean withWings;
    static final int LION_MAX_SPEED = 60;

    public Lion() {
        this.name = "Lion";
        this.speed = new SecureRandom().nextInt(LION_MAX_SPEED);
        this.withWings = flyAble();
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
        return "Lion{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }


}
