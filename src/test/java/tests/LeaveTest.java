package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {

    @Test
    public void invalidEmployeeNameSearch() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);

        // кликнуть на leave вкладку
        app.leavePage.leaveTab.click();

        // ввести имя сотрудника
        app.leavePage.employeeNameField.setValue("jdfdpjewfhnp3knj4k3j4kj");
        app.leavePage.searchButton.click();
        app.leavePage.errorMessage.shouldBe(Condition.exist);
        app.leavePage.errorMessage.shouldBe(Condition.visible);
    }
}
