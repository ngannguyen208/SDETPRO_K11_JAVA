package lesson_10_02;

public class InternalLoginPage extends LoginPage {

    private final String USERNAME_SEL = "#username";
    private final String PASSWORD_SEL = "#password";
    private final String LOGIN_BTN_SEL = "#btn";

    @Override
    public void inputUsername(String username) {
        System.out.printf("Login with username as %s and locator as %s\n", username, USERNAME_SEL);
    }

    @Override
    public void inputPassword(String password) {
        System.out.printf("Login with password as %s and locator as %s\n", password, PASSWORD_SEL);
    }

    @Override
    public void clickOnLoginBtn() {
        System.out.printf("Click on Login btn and locator as %s\n", LOGIN_BTN_SEL);
    }
}
