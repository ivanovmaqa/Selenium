package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class PIMTest extends BaseTest {

    @Test
    public void searchEmployeeInformation() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.pimPage.pimTab.click();
        app.pimPage.employeeNameField.clear();
        app.pimPage.employeeNameField.setValue("user");
        app.pimPage.searchButton.click();
        app.pimPage.searchResult.shouldBe(Condition.exist);
    }

    @Test
    public void searchEmployeeWithInvalidName() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.pimPage.pimTab.click();
        app.pimPage.employeeNameField.clear();
        // 101 символ:
        app.pimPage.employeeNameField.setValue("sindyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
                "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        app.pimPage.searchButton.click();
        app.pimPage.errorMessage.shouldBe(Condition.visible);
        app.pimPage.errorMessage.shouldHave(Condition.exactText("Should not exceed 100 characters"));
    }
}
