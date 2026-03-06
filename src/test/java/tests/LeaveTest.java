package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {

    @Test
    public void invalidEmployeeNameSearch() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
//        удаление значений из поля ввода (вариант1)
//        app.leavePage.employeeNameField.clear();
//        удаление значений из поля ввода (вариант2)
//        app.leavePage.employeeNameField.sendKeys(Keys.CONTROL + "A");
//        app.leavePage.employeeNameField.sendKeys(Keys.BACK_SPACE);
        app.leavePage.employeeNameField.setValue("jdfdpjewfhnp3knj4k3j4kj");
        app.leavePage.employeeNameField.shouldBe(Condition.exactValue("jdfdpjewfhnp3knj4k3j4kj"));
        app.leavePage.searchButton.click();
        app.leavePage.errorMessage.shouldBe(Condition.exist);
        app.leavePage.errorMessage.shouldBe(Condition.visible);
    }
}
