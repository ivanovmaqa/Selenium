package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest {

    @Test
    public void searchAdmin() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.searchButton.click();
    }

    @Test
    public void testDropDown() {
        app.adminPage.usernameField.click();
        app.adminPage.usernameField.getWrappedElement().findElement(byText("Москва")).click();
    }
}
