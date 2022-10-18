package lesson_12;

public class IOSDriver extends AppiumDriver {

    @Override
    protected AppiumDriver init() {
        System.out.println("Init IOS Driver");
        return null;
    }

    @Override
    protected void quit() {
        System.out.println("Quit IOS Driver Session");
    }
}
