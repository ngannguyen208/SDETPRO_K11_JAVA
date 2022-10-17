package lab_11;

import java.security.SecureRandom;

public class Falcon implements MoveAble, FlyAble {

    private String name;
    private int speed;
    private boolean withWings;
    static final int FALCON_MAX_SPEED = 80;

    public Falcon() {
        this.name = "Falcon";
        this.speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
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
        return "Falcon{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }


}
