package lesson_13;

public class AndroidDriver extends AppiumDriver {

    @Override
    protected void initDriver() {
        System.out.println("Init Androi Driver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Quit Androi Driver");
    }
}
