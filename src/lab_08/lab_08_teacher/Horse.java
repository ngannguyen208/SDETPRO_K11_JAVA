package lab_08.lab_08_teacher;

import java.security.SecureRandom;

public class Horse extends Animal {

    static final int HORSE_MAX_SPEED = 60;

    public Horse(String name) {
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }

}
