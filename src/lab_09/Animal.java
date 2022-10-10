package lab_09;

// Outer class
public class Animal {
    private String name;
    private int speed;
    private boolean withWings;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.withWings = builder.withWings;
    }

    // READ ONLY
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    // Inner class
    public static class Builder {
        private String name;
        private int speed;
        private boolean withWings;

        // WRITE ONLY
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }
}
