package lesson_08;

public class BatteryRobotDog extends RobotDog {

    static {
        dogId = 10;
    }

    public static void doSth() {
        System.out.println(dogId);
    }

    public static void main(String[] args) {
        BatteryRobotDog.doSth();
    }

}
