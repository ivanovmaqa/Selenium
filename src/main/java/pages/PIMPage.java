package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PIMPage extends BasePage{

    public SelenideElement pimTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
    //todo исправить ссылку на инпут:
    public SelenideElement employeeNameField = $(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
    public SelenideElement searchButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    public SelenideElement searchResult = $(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']"));
    public SelenideElement errorMessage = $(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
}
