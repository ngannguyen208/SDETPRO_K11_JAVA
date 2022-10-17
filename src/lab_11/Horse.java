package lab_11;

import java.security.SecureRandom;

public class Horse implements MoveAble, FlyAble {

    private String name;
    private int speed;
    private boolean withWings;
    static final int HORSE_MAX_SPEED = 75;

    public Horse() {
        this.name = "Horse";
        this.speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
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
        return "Horse{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }


}
