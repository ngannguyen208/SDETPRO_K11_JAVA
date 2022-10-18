package lesson_12;

public class LoginTest {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = new IOSDriver();

        boolean isIOS = System.getenv("platform").equalsIgnoreCase("IOS");

        if (isIOS) {
            appiumDriver = new IOSDriver();
        } else {
            appiumDriver = new AndroidDriver();
        }

        appiumDriver.init();

        // Logic Test

        /*
        * find element
        * interact with element ....
         */
        appiumDriver.quit();
    }
}
