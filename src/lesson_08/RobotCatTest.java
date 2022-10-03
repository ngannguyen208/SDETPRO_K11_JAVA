package lesson_08;

public class RobotCatTest {

    // Module
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();

        batteryRobotCat.setName("Battery RobotCat");
        System.out.println(batteryRobotCat.charge());
        solarRobotCat.setName("Solar RobotCat");
        System.out.println(solarRobotCat.charge());

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);
    }


}
