package lesson_13;

public class DriverFactory {

    public static void initAppiumDriver(PlatformType platformType) {
        switch (platformType) {
            case IOS:
                System.out.println("Init IOS Driver");
                System.out.println(platformType.getVersion());
                break;
            case ANDROID:
                System.out.println("Init ANDROID Driver");
                System.out.println(platformType.getVersion());
                break;
            default:
                System.out.println("Please provide the platform!");
        }
    }
}
