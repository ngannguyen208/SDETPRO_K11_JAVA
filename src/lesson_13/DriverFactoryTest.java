package lesson_13;

public class DriverFactoryTest {

    public static void main(String[] args) {
        DriverFactory.initAppiumDriver(PlatformType.IOS);
        DriverFactory.initAppiumDriver(PlatformType.ANDROID);

    }
}
