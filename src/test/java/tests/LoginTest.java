package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginWithValidCreds() {
        loginPage.usernameField.setValue("Admin");
        loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        loginPage.passwordField.setValue("admin123");
        loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));
        loginPage.loginButton.click();
    }

    @Test
    public void loginWithInValidCreds() {
        loginPage.usernameField.setValue("Admin");
        loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        loginPage.passwordField.setValue("wrong");
        loginPage.passwordField.shouldHave(Condition.exactValue("wrong"));
        loginPage.loginButton.click();
        loginPage.errorMessage.shouldBe(Condition.visible);
        loginPage.errorMessage.shouldHave(Condition.exactText("Invalid credentials"));
        loginPage.usernameField.shouldBe(Condition.empty);
        loginPage.passwordField.shouldBe(Condition.empty);
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
