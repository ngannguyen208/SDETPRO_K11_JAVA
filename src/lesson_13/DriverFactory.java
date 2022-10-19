package lesson_13;

public class DriverFactory {

    public static void initAppiumDriver(PlatformType platformType) {
        switch (platformType) {
            case IOS:
                System.out.println("Init IOS Driver");
                break;
            case ANDROID:
                System.out.println("Init ANDROID Driver");
                break;
            default:
                System.out.println("Please provide the platform!");
        }
    }
}
