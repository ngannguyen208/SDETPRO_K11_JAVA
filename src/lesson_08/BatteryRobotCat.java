package lesson_08;

// Child class | Concrete class
public class BatteryRobotCat extends RobotCat{

    // Re-implement the parent's method
    @Override
    public String charge() {
        return super.charge() + "with electric";
    }
}
