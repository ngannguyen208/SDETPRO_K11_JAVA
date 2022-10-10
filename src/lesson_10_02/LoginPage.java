package lesson_10_02;

public abstract class LoginPage {

    public abstract void inputUsername(String username);
    public abstract void inputPassword(String password);
    public abstract void clickOnLoginBtn();

    public void login(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickOnLoginBtn();
    }
}
