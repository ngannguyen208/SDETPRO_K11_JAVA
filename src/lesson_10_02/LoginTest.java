package lesson_10_02;

public class LoginTest {

    public static void main(String[] args) {
        LoginTestFlow testFlow = new LoginTestFlow("Cana", "123456");

        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        testFlow.loginWithCred(internalLoginPage);
        testFlow.loginWithCred(externalLoginPage);
    }
}
