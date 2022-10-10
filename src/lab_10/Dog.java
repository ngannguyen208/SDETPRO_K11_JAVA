package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    static final int DOG_MAX_SPEED = 60;

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(DOG_MAX_SPEED);
        return randomSpeed;
    }



}
