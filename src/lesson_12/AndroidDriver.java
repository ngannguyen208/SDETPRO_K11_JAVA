package lesson_12;

public class AndroidDriver extends AppiumDriver {

    @Override
    protected AppiumDriver init() {
        System.out.println("Init Android Driver");
        return null;
    }

    @Override
    protected void quit() {
        System.out.println("Quit Android Driver Session");
    }
}
