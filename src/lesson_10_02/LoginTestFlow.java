package lesson_10_02;

public class LoginTestFlow {

    private String username;
    private String password;

    public LoginTestFlow(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void loginWithCred(LoginPage loginPage) {
        loginPage.login(username, password);
    }
}
