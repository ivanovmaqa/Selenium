package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginWithValidCreds() {
        loginPage.usernameField.setValue("Admin");
        loginPage.passwordField.setValue("admin123");
        loginPage.loginButton.click();
    }

    @Test
    public void loginWithInValidCreds() {
        loginPage.usernameField.setValue("Admin");
        loginPage.passwordField.setValue("wrong");
        loginPage.loginButton.click();
        // TODO проверка что мы действительно залогинились
    }

    @Test
    public void loginWithInValidUsername() {
        loginPage.usernameField.setValue("wrong");
        loginPage.passwordField.setValue("admin123");
        loginPage.loginButton.click();
        // TODO проверка что мы действительно залогинились
    }

    @Test
    public void loginWithEmptyCreds() {
        loginPage.usernameField.setValue("");
        loginPage.passwordField.setValue("");
        loginPage.loginButton.click();
        // TODO проверка что мы действительно залогинились
    }

    @Test
    public void loginWithLongUsername() {
        loginPage.usernameField.setValue("sdfghjkl;lkjhgfddfghjklkjhgfdfghjkl;lkjhfghjkl;lkjhg");
        loginPage.passwordField.setValue("");
        loginPage.loginButton.click();
        // TODO проверка что мы действительно залогинились
    }
}
