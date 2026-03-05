package tests;

import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test
    public void searchAdmin() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.searchButton.click();
    }
}
