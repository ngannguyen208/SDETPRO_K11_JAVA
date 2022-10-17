package lab_11;

import java.security.SecureRandom;

public class Eagle implements MoveAble, FlyAble {

    private String name;
    private int speed;
    private boolean withWings;
    static final int EAGLE_MAX_SPEED = 100;

    public Eagle() {
        this.name = "Eagle";
        this.speed = new SecureRandom().nextInt(EAGLE_MAX_SPEED);
        this.withWings = flyAble();
    }

    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }


}
