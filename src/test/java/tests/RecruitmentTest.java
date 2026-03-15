package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class RecruitmentTest extends BaseTest {

    //выбор элемента в выпадающем меню и поиск
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Tag("smoke")
    public void searchAndDropDownJobTitle() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.recruitmentPage.recruitmentTab.click();
        app.recruitmentPage.methodOfApplicationRoleButton.click();
        app.recruitmentPage.methodOfApplicationDropDown.getWrappedElement().findElement(byText("Manual")).click();
        app.recruitmentPage.selectedMethod.shouldHave(Condition.exactText("Manual"));
        app.recruitmentPage.searchButton.click();
    }

    //выбор элемента в выпадающем меню, поиск и проверка результата поиска
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Tag("regression")
    public void checkValidJobTitleSearchResult() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.recruitmentPage.recruitmentTab.click();
        app.recruitmentPage.methodOfApplicationRoleButton.click();
        app.recruitmentPage.methodOfApplicationDropDown.getWrappedElement().findElement(byText("Manual")).click();
        app.recruitmentPage.selectedMethod.shouldHave(Condition.exactText("Manual"));
        app.recruitmentPage.searchButton.click();
        app.recruitmentPage.searchResult.shouldNotHave(Condition.exactText("No Records Found"));
    }

    //поиск невалидного имени кандидата и проверка сообщения об ошибке
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Tag("smoke")
    public void searchInvalidCandidateName() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.recruitmentPage.recruitmentTab.click();
        app.recruitmentPage.candidateNameField.setValue("asdas14d");
        app.recruitmentPage.candidateNameField.shouldHave(Condition.exactValue("asdas14d"));
        app.recruitmentPage.searchButton.click();
        app.recruitmentPage.errorMessage.shouldHave(Condition.exactText("Invalid"));
    }

    //выбираем дату ОТ в выпадающем календаре без вставки в инпут
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Tag("smoke")
    public void selectDateFromDropDownCalendar() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.recruitmentPage.recruitmentTab.click();
        app.recruitmentPage.dateOfApplicationRoleButtonFrom.click();
        app.recruitmentPage.dateOfApplicationBackButton.click();
        app.recruitmentPage.dayOfApplicationDropDown.findElement(byText("2")).click();
        app.recruitmentPage.searchButton.click();
        app.recruitmentPage.searchResult.shouldNotHave(Condition.exactText("No Records Found"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Tag("smoke")
    public void selectDateToDropDownCalendar() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.recruitmentPage.recruitmentTab.click();
        app.recruitmentPage.dateOfApplicationRoleButtonTo.click();
        app.recruitmentPage.dateOfApplicationTodayButton.click();
        app.recruitmentPage.searchButton.click();
        app.recruitmentPage.searchResult.shouldNotHave(Condition.exactText("No Records Found"));
    }
}
