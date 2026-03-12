package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest {

    @Test
    public void saveValidMyInfo() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.myInfoPage.myInfoTab.click();
        app.myInfoPage.personalDetailsTab.click();
        app.myInfoPage.firstNameField.clear();
        app.myInfoPage.firstNameField.setValue("sindy");
        app.myInfoPage.middleNameField.clear();
        app.myInfoPage.middleNameField.setValue("glen");
        app.myInfoPage.lastNameField.clear();
        app.myInfoPage.lastNameField.setValue("alex");
        app.myInfoPage.birthdayField.clear();
        app.myInfoPage.birthdayField.setValue("1986-02-02");
        app.myInfoPage.genderRadioButton.click();
        app.myInfoPage.saveButton.click();
//        далее проверка через PIMtest сохранилась ли инфо
    }

    @Test
    public void searchEmployeeWithMyInfo() {
        app.pimPage.pimTab.click();
        app.pimPage.employeeNameField.clear();
        app.pimPage.employeeNameField.setValue("sindy glen alex");
        app.pimPage.employeeNameField.shouldHave(Condition.exactValue("sindy glen alex"));
        app.pimPage.searchButton.click();
        app.pimPage.searchResult.shouldBe(Condition.exist);
    }
}