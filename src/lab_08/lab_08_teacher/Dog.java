package lab_08.lab_08_teacher;

import java.security.SecureRandom;

public class Dog extends Animal {

    static final int DOG_MAX_SPEED = 40;

    public Dog(String name) {
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
    }
}
