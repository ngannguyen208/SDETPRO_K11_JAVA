package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {

    static final int TIGER_MAX_SPEED = 100;

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
        return randomSpeed;
    }
}
