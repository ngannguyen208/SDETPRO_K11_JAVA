package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {

    static final int HORSE_MAX_SPEED = 75;

    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        return randomSpeed;
    }
}
