package lab_08.lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(50);
        return randomSpeed;
    }
}
